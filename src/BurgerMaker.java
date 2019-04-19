public abstract class BurgerMaker {

    private Burger burger;

    public Burger getBurger() {
        return burger;
    }

    public void setBurger(Burger burger) {
        this.burger = burger;
    }

    public final Burger makeBurger() {
        Burger burger = createBurger();
        setBurger(burger);
        setBurgerType();
        setBun();
        setPatty();
        setCheese();
        setSauce();
        return burger;
    }

    abstract void setBurgerType();

    abstract void setBun();

    abstract void setPatty();

    abstract void setCheese();

    abstract void setSauce();

    abstract Burger createBurger();

}