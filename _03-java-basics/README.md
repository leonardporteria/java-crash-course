# JAVA BASICS

- syntax
- output
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
- variables
- operators
- type casting
```java
public class Main {
    public static void main(String[] args) {
        int integerNumber = 18;
        double decimalNumber = integerNumber;

        System.out.println(integerNumber);
        System.out.println(decimalNumber);
    }
}
```
```java
public class Main {
    public static void main(String[] args) {
        int integerNumber = 18;
        double decimalNumber = (double) integerNumber;

        System.out.println(integerNumber);
        System.out.println(decimalNumber);
    }
}
```

- read/user input
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String username;

        System.out.println("Enter Username: ");
        username = myScanner.nextLine();

        System.out.println("Your Username is " + username);
    }
}
```
- conditions [if switch]
```java

```
- loop [while do-while for foreach break continue]
```java

```
- string
```java

```
- array
```java

```
- math
```java

```
