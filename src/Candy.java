public class Candy implements ItemElement{
    private int pricePerPound;
    private int weight;

    public Candy(int pricePerPound, int weight)
    {
        this.pricePerPound=pricePerPound;
        this.weight=weight;
    }

    public int getPricePerPound()
    {
        return pricePerPound;
    }

    public int getWeight()
    {
        return weight;
    }

    @Override
    public int accept(Visitor visitor)
    {
        return visitor.visit(this);
    }
}
