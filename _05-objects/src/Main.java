public class Main {
    public static void main(String[] args) {
        Burger classicBurger = new Burger(true, true, true, true, true);

        Burger cheeseBurger = new Burger(true, true, true, true);

        Burger plainBurger = new Burger(true, true, true);

        Burger sadBurger = new Burger(true, true);

        Burger buns = new Burger(true);

        Burger air = new Burger();
    }
}
