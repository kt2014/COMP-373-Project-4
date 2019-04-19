public class Burger {
    private int bun;
    private int patty;
    private int cheese;
    private int sauce;
    private String burgerName;

    public int getBun(){
        return bun;
    }
    public void setBun(int bun){
        this.bun = bun;
    }

    public int getPatty() {
        return patty;
    }

    public void setPatty(int patty) {
        this.patty = patty;
    }

    public int getCheese() {
        return cheese;
    }

    public void setCheese(int cheese) {
        this.cheese = cheese;
    }

    public int getSauce() {
        return sauce;
    }

    public void setSauce(int sauce) {
        this.sauce = sauce;
    }


    public String getBurgerName() {
        return burgerName;
    }

    public void setBurgerName(String burgerName) {
        this.burgerName = burgerName;
    }

    public String toString() {
        return "Products needed to build " + burgerName + " " + bun + " bun, " + patty +
                " oz patty, " + cheese + " oz cheese, " + sauce + " oz of sauce";
    }

}
