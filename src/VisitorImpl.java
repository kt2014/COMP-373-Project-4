public class VisitorImpl implements Visitor {
    @Override
    public int visit(Dress dress)
    {
        int cost=0;

        cost = dress.getPrice();

        System.out.println("Dress Occasion: "+dress.getOccasion() +"; Cost = " +cost);
        return cost;
    }

    @Override
    public int visit(Candy candy)
    {
        int cost = candy.getPricePerPound()*candy.getWeight();
        System.out.println("Candy Cost = "+cost);
        return cost;
    }

}
