public class ShopKeeper {
    public static Burger takeOrder(String burgerType) {

        BurgerMaker burgerMaker = null;

        if (burgerType.equalsIgnoreCase("cheeseburger")) {
            burgerMaker = new CheeseBurger();
        }

        else if (burgerType.equalsIgnoreCase("hamburger")) {
            burgerMaker = new HamBurger() {
            };
        }
         else {
            System.out.println("Sorry we don't take order for  " + burgerType);
        }
        return burgerMaker.makeBurger();
    }
}
