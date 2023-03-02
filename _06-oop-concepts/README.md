# OOP CONCEPTS

---
## Encapsulation

### Private access modifier
> Most restrictive access modifier. Class cannot be private. 
> Variables that are private with the use of getter and setter.

`Main.java`
```java
public class Main {
    public static void main(String[] args) {
        // using setter and getter
        Password myPassword = new Password();

        myPassword.setPassword("TUMALSER");

        String myPrivatePassword = myPassword.getPassword();

        System.out.println(myPrivatePassword);


        // using constructor to set password
        Password anotherPassword = new Password("MYPASSWORD");
        System.out.println(anotherPassword.getPassword());

    }
}
```

`Password.java`
```java
public class Password {
    private String password;

    Password(){
        // ...
    }
    Password(String password){
        this.password = password;
    }

    void setPassword(String password){
        this.password = password;
    }

    String getPassword(){
        return this.password;
    }
}
```



---
## Inheritance
`Main.java`
```java
public class Main {
    public static void main(String[] args) {
        // parent class
        Vehicle whatTypeOfVehicle = new Vehicle();

        System.out.println( whatTypeOfVehicle.speedInKilometers);
        whatTypeOfVehicle.move();

        // children class
        Car myCar = new Car();
        System.out.println(myCar.speedInKilometers);
        System.out.println(myCar.wheels);

        myCar.move();
        myCar.openTrunk();

        // children class
        Bike myBike = new Bike();
        System.out.println(myBike.speedInKilometers);
        System.out.println(myBike.wheels);

        myBike.wheelie();
        myBike.stop();
    }
}
```

`Vehicle.java`
```java
public class Vehicle {
    double speedInKilometers = 0;

    void move() {
        System.out.println("Vehicle moved");
    }

    void stop() {
        System.out.println("Vehicle stopped");
    }
}
```

`Car.java`
```java
public class Car extends Vehicle{
    int wheels = 4;

    void openTrunk(){
        System.out.println("Car Opened the trunk");
    }
}
```

`Bike.java`
```java
public class Bike extends Vehicle{

    int wheels = 4;

    void wheelie(){
        System.out.println("Bike did a wheelie");
    }
}
```

---
## Static
> A modifier that set a single copy of a variable/method. The class owns the static member, not the instantiated object.

`Main.java`
```java
public class Main {
    public static void main(String[] args) {
        Wonderpets linny = new Wonderpets("Linny");
        linny.displayPetName();

        Wonderpets tuck = new Wonderpets("Tuck");
        tuck.displayPetName();

        Wonderpets mingming = new Wonderpets("Mingming");
        mingming.displayPetName();
        
        // static member of Wonderpets
        int numberOfWonderpets = Wonderpets.numberOfPets;
        System.out.println(numberOfWonderpets);

        Wonderpets.displayPetNumbers();
    }
}
```

`Wonderpets.java`
```java
public class Wonderpets {
    static int numberOfPets;
    String petName;

    Wonderpets(String petName) {
        this.petName = petName;
        numberOfPets++;
    }

    void displayPetName() {
        System.out.println("Your pet is " + this.petName);
    }

    static void displayPetNumbers() {
        System.out.println("You have " + numberOfPets + " Wonderpets");
    }
}
```

---
## Polymorphism
`Main.java`

```java
public class Main {
    public static void main(String[] args) {
        // Bike Object
        Bike myBike = new Bike();

        myBike.move();
        myBike.stop();

        // Car object
        Car myCar = new Car();

        myCar.move();
        myCar.stop();
    }
}
```
`Vehicle.java`
```java
public class Vehicle {
    double speedInKilometers = 0;

    void move() {
        System.out.println("Vehicle moved");
    }

    void stop() {
        System.out.println("Vehicle stopped");
    }
}
```

`Car.java`
```java
public class Car extends Vehicle{
    int wheels = 4;

    void openTrunk(){
        System.out.println("Car Opened the trunk");
    }

    void move(){
        System.out.println("The CAR stepped on the gas");
    }

    void stop(){
        System.out.println("The CAR stepped on the brake");
    }
}
```

`Bike.java`
```java
public class Bike extends Vehicle{

    int wheels = 4;

    void wheelie(){
        System.out.println("Bike did a wheelie");
    }

    void move(){
        System.out.println("The BIKE pedals");
    }
}
```

---
## Exceptions
> This will prevent java to stop the program. Even after the error, the program will proceed due to the error handling.
```java
public class Main {
    public static void main(String[] args) {
        try {
            int[] myArray = {1, 2, 3};
            System.out.println(myArray[10]);
        } catch (Exception e) {
            System.out.println("Error!");
            System.out.println("The error is " + e.getMessage());
        }
    }
}
```

