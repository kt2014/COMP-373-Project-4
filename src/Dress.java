public class Dress implements ItemElement {
    private int price;
    private String occasion;

    public Dress(int cost, String occasion)
    {
        this.price=cost;
        this.occasion=occasion;
    }

    public int getPrice()
    {
        return price;
    }

    public String getOccasion()
    {
        return occasion;
    }

    @Override
    public int accept(Visitor visitor)
    {
        return visitor.visit(this);
    }
}
