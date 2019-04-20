public abstract class HamBurger extends BurgerMaker {
    Burger createBurger() {
        return new Burger();
    }

    public void setBun(){
        System.out.println("Step 1 : Take the bun");
        getBurger().setBun(1);
    }

    public void setPatty() {
        System.out.println("Step 1 : Add the patty to bun");
        getBurger().setPatty(1);
    }
    public void setCheese() {
        getBurger().setCheese(0);
    }
    void setSauce() {
        System.out.println("Step 3 : Add sauce to burger");
        getBurger().setSauce(5);
    }

    void setBurgerType() {
        System.out.println("Building Hamburger!");
        getBurger().setBurgerName("hamburger:");
    }

}