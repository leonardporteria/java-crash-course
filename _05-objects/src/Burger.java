public class Burger {
    boolean buns, meat, sauce, cheese, vegetables;

    Burger(boolean buns, boolean meat, boolean sauce, boolean cheese, boolean vegetables) {
        this.buns = buns;
        this.meat = meat;
        this.sauce = sauce;
        this.cheese = cheese;
        this.vegetables = vegetables;
    }

    Burger(boolean buns, boolean meat, boolean sauce, boolean cheese) {
        this.buns = buns;
        this.meat = meat;
        this.sauce = sauce;
        this.cheese = cheese;
    }

    Burger(boolean buns, boolean meat, boolean sauce) {
        this.buns = buns;
        this.meat = meat;
        this.sauce = sauce;
    }

    Burger(boolean buns, boolean meat ) {
        this.buns = buns;
        this.meat = meat;
    }

    Burger(boolean buns) {
        this.buns = buns;
    }

    // default constructor
    Burger() {
        // ...
    }
}
