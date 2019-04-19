public class Client {
    public static void main(String[] args)
    {
        ItemElement[] items = new ItemElement[]{new Dress(20, "Casual"),
                new Dress(100, "Prom"),
                new Candy(5, 5)};

        int total = calculatePrice(items);
        System.out.println("\nTotal Cost = "+total);
    }

    private static int calculatePrice(ItemElement[] items)
    {
        Visitor visitor = new VisitorImpl();
        int sum=0;
        for(ItemElement item : items)
        {
            sum = sum + item.accept(visitor);
        }
        return sum;
    }
}
