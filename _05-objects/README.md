# JAVA OBJECT ORIENTED PROGRAMMING (OOP)

---
## Objects
> `myTumbler` is an instance of the class Tumbler. 

```java
public class Main {
    public static void main(String[] args) {
        // myTumbler's data type is now object
        // an object's property can be accessed using dot notation
        Tumbler myTumbler = new Tumbler();

        System.out.println(myTumbler.brand);
        System.out.println(myTumbler.sizeInMilliliters);

        myTumbler.drink();
        myTumbler.refill();
    }
}
```

---
## Class 

### Same File
> uses `class <ClassName> `
```java
public class Main {
    public static void main(String[] args) {
        // myTumbler's data type is now object
        // an object's property can be accessed using dot notation
        Tumbler myTumbler = new Tumbler();

        System.out.println(myTumbler.brand);
        System.out.println(myTumbler.sizeInMilliliters);

        myTumbler.drink();
        myTumbler.refill();
    }
}

// class named Tumbler, this will serve as a template for an object
class Tumbler {
    String brand = "AquaFlask";
    double sizeInMilliliters = 1000;
    String color = "grey";
    void drink (){
        System.out.println("You drank from the tumbler");
    }
    void open (){
        System.out.println("You opened the tumbler");
    }
    void refill (){
        System.out.println("You refill the tumbler");
    }
}
```


### External File
> uses `public class <ClassName>` </br>
> import is not necessary as long as both files are in the same package.

`Main.java`

```java
public class Main {
    public static void main(String[] args) {
        // myTumbler's data type is now object
        // an object's property can be accessed using dot notation
        Tumbler myTumbler = new Tumbler();

        System.out.println(myTumbler.brand);
        System.out.println(myTumbler.sizeInMilliliters);

        myTumbler.drink();
        myTumbler.refill();
    }
}

```

`Tumbler.java`

```java
public class Tumbler {
    String brand = "AquaFlask";
    double sizeInMilliliters = 1000;
    String color = "grey";

    void drink (){
        System.out.println("You drank from the tumbler");
    }
    void open (){
        System.out.println("You opened the tumbler");
    }
    void refill (){
        System.out.println("You refill the tumbler");
    }
}

```

---
## Constructor
> The class `Mouse` is reusable. It just needs to be instantiated to a variable that will become an object.
> The constructor in the `Mouse` class allows it to be reusable since different value can be placed in the object.

`Main.java`
```java
public class Main {
    public static void main(String[] args) {
        Mouse myLogifakeMouse = new Mouse("Logifake", 800, 6, false, true);

        System.out.println(myLogifakeMouse.brand);
        System.out.println(myLogifakeMouse.programmable);
        
        Mouse myA4TechMouse = new Mouse("A4 Tech", 1200, 4, true, false);
        System.out.println(myA4TechMouse.brand);
        System.out.println(myA4TechMouse.programmable);
    }
}
```

`Mouse.java`
```java
public class Mouse {
    String brand;
    int dpi;
    int numberOfButtons;
    boolean programmable;
    boolean rgb;

    Mouse(String brand, int dpi, int numberOfButtons, boolean programmable, boolean rgb) {
        this.brand = brand;
        this.dpi = dpi;
        this.numberOfButtons = numberOfButtons;
        this.programmable = programmable;
        this.rgb = rgb;
    }
}
```

---
## Constructor Overloading

`Main.java`

```java
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
```


`Burger.java`

```java
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
```
