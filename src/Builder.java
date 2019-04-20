public class Builder {

        public static void main(String[] args) {

            Burger cheeseburger = ShopKeeper.takeOrder("Cheeseburger");
            System.out.println(cheeseburger);
            Burger hamburger = ShopKeeper.takeOrder("Hamburger");
            System.out.println(hamburger);
        }
}

