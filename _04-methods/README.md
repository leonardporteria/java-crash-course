# JAVA METHODS

---

## Method

### Access Modifiers

| Modifier       | Class | Package | Subclass | Global |
|----------------|-------|---------|----------|--------|
| public         | yes   | yes     | yes      | yes    |
| protected      | yes   | yes     | yes      | no     |
| default (none) | yes   | yes     | no       | no     |
| private        | yes   | no      | no       | no     |

```java
public class Method {
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
    
    // DEFINING A METHOD
    // <accessModifiers> <static?> <returnType> <methodName> (parameters<type> <name>)
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

---

## Method Overloading
> same method name but different in parameters. the called method with correct parameter will be called.

```java
public class MethodOverloading {
    public static void main(String[] args) {
        int product = multiply(5, 6, 2);
        System.out.println(product);
    }

    // METHOD OVERLOADING
    static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    static int multiply(int num1, int num2, int num3) {
        return num1 * num2 * num3;
    }

    static int multiply(int num1, int num2, int num3, int num4) {
        return num1 * num2 * num3 * num4;
    }

    static int multiply(int num1, int num2, int num3, int num4, int num5) {
        return num1 * num2 * num3 * num4 * num5;
    }
}
```

---

## Recursion
> a method that calls itself again and again until a base condition is fulfilled

```java
public class Recursion {
    public static void main(String args[]) {
        int factorial = getFactorial(5);
        System.out.println("The factorial of " + 5 + " is " + factorial);
    }
    static int getFactorial(int number) {
        if (number > 0)
            return number * getFactorial(number - 1);
        else
            return 1;
    }
}

```

### Callstack
> uses stack data structure that performs the recursive function from the end
```java
// callback hell
getFactorial(5)
  getFactorial(5-1)
    getFactorial(4-1)
      getFactorial(3-1)
        getFactorial(2-1)
          getFactorial(1-1)
            getFactorial(0)
              if(number > 0) false
              else return 1;
                // start to run backwards

// CALLSTACK
getFactorial(0)
getFactorial(1)
getFactorial(2)
getFactorial(3)
getFactorial(4)
getFactorial(5)
```

### StackOverflow
```bash
Exception in thread "main" java.lang.StackOverflowError
	at Recursion.getFactorial(Recursion.java:9)
	at Recursion.getFactorial(Recursion.java:9)
```

---
## Global Scope
```java
public class Scope {

    // instance variables
    public int age = 10;
    static String name = "Juan";

    public static void main(String[] args) {
        Scope myScope = new Scope();

        System.out.println(myScope.age);
        System.out.println(name);
    }

    static int getAge() {
        return new Scope().age;
    }
}

```
### static keyword
> A static method/instance variable can be accessed without creating an object of the class first


---
## Wrapper Classes
> Allows primitive data types to be a Reference data type. 
> Transforming the variable into an object and allows to use different built-in mehtods.
```java
public class WrapperClasses {
    public static void main(String[] args) {
        Integer myInteger = 18;
        Double myDouble = 3.89;
        Character myChar = 'a';

        System.out.println(myInteger.doubleValue());
        System.out.println(myDouble.intValue());
        System.out.println(myChar.hashCode());
    }
}
```