# JAVA BASICS

---
## Output
```java
public class Main {
    public static void main(String[] args) {
        int age = 20;

        System.out.println("Hello world! my age is " + age);
        System.out.print("Hello again! \n");
        System.out.printf("My age is %d", age);
    }
}
```
---
## Type Casting
```java
public class Casting {
    public static void main(String[] args) {
        // casting (primitive data types)
        int integerNumber = 18;
        double decimalNumber = (double) integerNumber;

        System.out.println(integerNumber);
        System.out.println((double) integerNumber);
        System.out.println(decimalNumber);

        // parsing
        String myStringNumber = "15";
        int myIntNumber = Integer.parseInt(myStringNumber);
        double myDoubleNumber = Double.parseDouble(myStringNumber);

        System.out.println(myIntNumber);
        System.out.println(myDoubleNumber);

    }
}
```
---
## User Input
```java
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String username;

        System.out.println("Enter Username: ");
        username = myScanner.nextLine();

        System.out.println("Your Username is " + username);
    }
}
```
---
## Conditions 
```java
public class Conditions {
    public static void main(String[] args) {
        int age = 24;

        // if else
        if (age < 18) {
            System.out.println("You are a minor");
        } else {
            System.out.println("You are not a minor");
        }

        // ternary operator
        boolean isMinor = (age < 18) ? true : false;
        System.out.println(isMinor);

        // switch
        int currentMonth = 3;
        String monthName;
        switch(currentMonth) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
                // ...
            default:
                System.out.println("months are only 1-12");
        }
    }
}
```
---
## Loops 
```java
public class Loop {
    public static void main(String[] args) {
        int index = 0;
        // while
        while (index <= 5){
            index++;
            System.out.println(index);
        }
        // do while
        do {
            index++;
            if(index == 4) continue;
            System.out.println(index);
        } while (index <= 10);

        // for
        for (int i = 0; i < 5; i++){
            if (i == 3) break;
            System.out.println(i);
        }

        // foreach
        String[] animals = {"Dog", "Cat", "Bird", "Fish", "Chicken"};
        // (singleElement : Array)
        for (String animal : animals) {
            System.out.println(animal);
        }
    }
}
```
---
## Array
```java
public class Array {
    public static void main(String[] args) {
        // arrays
        String[] animals = {"Dog", "Cat", "Bird", "Fish", "Chicken"};
        animals[2] = "Bats";

        // empty array
        int[] winningCombination = new int[6];
        winningCombination[0] = 58;
        winningCombination[1] = 38;
        winningCombination[2] = 16;
        winningCombination[3] = 27;
        winningCombination[4] = 3;
        winningCombination[5] = 56;


        // 2d array
        int[][] possiblePins = {{1, 2, 3, 4}, {5, 6, 7, 8}};

        // array method
        int arrayLength = winningCombination.length;
        int arrayLength2D = possiblePins[1].length;
        System.out.println("Array Length: 1D:" + arrayLength);
        System.out.println("Array Length: 2D:" + arrayLength2D);

        // iterate through an array of undefined length
        for(int i = 0; i < animals.length; i++){
            System.out.println(animals[i]);
        }
    }
}
```
---
## String
```java
public class String {
    public static void main(String[] args) {
        // String methods
        String myString = "Hello World!";
        String firstName = "Juan ";
        String lastName = "Dela Cruz";
        String fullName;
        String helloString1 = "hello";
        String helloString2 = "HeLlo";
        String emptySpace = "         Hi!     ";

        // length
        int stringLength = myString.length();
        System.out.println(stringLength);

        // isEmpty
        // (return boolean)
        boolean isEmpty = myString.isEmpty();
        System.out.println(isEmpty);

        // charAt (position (int))
        // (return char)
        char myChar = myString.charAt(6);
        System.out.println(myChar);

        // indexOf (char in string (char))
        // (return int)
        int myIndex = myString.indexOf('l');
        System.out.println(myIndex);

        // contains (sequence of chars (String))
        // (return boolean)
        boolean hasThisString = myString.contains("Hell");
        System.out.println(hasThisString);

        // compareTo (2nd string)
        // (return int)
        int isNotTheSame = helloString1.compareTo(helloString2);
        System.out.println(isNotTheSame);

        // compareToIgnoreCase (2nd string)
        // (return int)
        int isTheSame = helloString1.compareToIgnoreCase(helloString2);
        System.out.println(isTheSame);

        // endsWith (char in string (char))
        // (return boolean)
        boolean endsWithExclamation = myString.endsWith("!");
        System.out.println(endsWithExclamation);

        // concat (2nd string)
        // (return String)
        fullName = firstName.concat(lastName);
        System.out.println(fullName);

        // replace (target String, replacement String)
        // (return String)
        fullName = fullName.replace("Juan", "John");
        System.out.println(fullName);

        // toLowerCase
        // (return String)
        fullName = fullName.toLowerCase();
        System.out.println(fullName);

        // toUpperCase
        // (return String)
        fullName = fullName.toUpperCase();
        System.out.println(fullName);

        // trim
        // (return String)
        emptySpace = emptySpace.trim();
        System.out.println(emptySpace);
    }
}

```
---
## Math
```java
import java.lang.Math;

public class Math {
    public static void main(String[] args) {
        // Math Methods
        double myDouble = 18.499;
        double myLowDecimal = 5.46;
        double myHighDecimal = 7.89;
        double roundUp, roundDown, rounded;
        double power;
        double myRandomNumber;

        // ceil (number)
        // (return double)
        roundUp = Math.ceil(myLowDecimal);
        System.out.println(roundUp);

        // floor (number)
        // (return double)
        roundDown = Math.floor(myHighDecimal);
        System.out.println(roundDown);

        // round (number)
        // (return double)
        rounded = Math.round(myDouble);
        System.out.println(rounded);

        // pow (constant, exponent)
        // (return double)
        power = Math.pow(3, 4);
        System.out.println(power);

        // random
        // (return double) - between 0 - 1
        myRandomNumber = Math.random();
        System.out.println(myRandomNumber);
    }
}

```
---
## Method

```java
public class Methods {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        myNewMethod();

        printName("Juan");

        int doubledNumber = doubleTheInteger(5);
        System.out.println(doubledNumber);

        boolean isMinor = checkIfMinor(17);
        System.out.println(isMinor);

        int[] myArray = {9, 2, 3, 5, 4, 7, 8, 3, 2, 1, 6, 7};
        displayArray(myArray);
    }

    static void myNewMethod() {
        System.out.println("I'm the new method!");
    }

    static void printName(String name) {
        System.out.println("My name is " + name);
    }

    static boolean checkIfMinor(int age) {
        return age < 18 ? true : false;
    }

    static int doubleTheInteger(int number) {
        return number * 2;
    }

    static void displayArray(int[] myIntegerArray) {
        System.out.print("The value of the array are: ");
        // for loop
//        for (int i = 0; i < myIntegerArray.length; i++){
//            System.out.print(myIntegerArray[i] + " ");
//        }

        // foreach
        for (int number : myIntegerArray) {
            System.out.print(number + " ");
        }
    }
}
```
