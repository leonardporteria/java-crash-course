# JAVA FUNDAMENTALS

- [ ] Folder Structure
- [ ] Boilerplate
- [ ] Data Types
- [ ] Naming Conventions
- [ ] How to name things

---

## Java Folder Structure

``` java
Project/                        // Project Folder
└── src                         // Java Files Folder
    ├─── Main.java              // Main Method Holder
    └─── Modules.java ...       // Misc/Util Java Files
```

---
## Java Boilerplate

The main method is the first method that will **always** be called upon execution of the program. 

```java
public class Main {                                 // Class named 'Main'
    public static void main(String[] args) {        // Main Method
        System.out.println("Hello world!");
    }
}
```

---
## Data Types
There are two data types - Primitive and Reference. 

> Primitive data type specifies the size and type of variable values

| Data Type     | Memory Size | Value                           |
|---------------|-------------|---------------------------------|
| boolean       | 1bit        | `true` or `false`               |
| byte          | 1byte       | -128 to 127                     |
| short         | 1byte       | -32,768 to 32,767               |
| int           | 1byte       | ~-2billion to ~2billion         |
| long          | 1byte       | ~-9quintillion to ~9quintillion |
| float         | 1byte       | 6 to 7 decimal places           |
| double        | 1byte       | 15 decimal places               |
| char          | 1byte       | single character                |

> Reference data type does not specify the size and type of variable values. </br>
> String, Array, and Classes are Reference data types.

```java
boolean isOnline = true;
byte age = 18;
short distanceInMiles = 634;
// you can use underscores to separate by hundreds
int elapsedTimeInMilliseconds = 1_547_146_841;
// you need 'L' identifier at the end to make it a long data type  
long winningChances = 832154987613L;
// you need 'f' identifier at the end to make it a float data type  
float userWeightInKilograms = 65.875f;
final double PI = 3.14159265358979;
char endingPunctuation = '!';

String firstName = "John Mark";
int[] arrayPlaceholder;
```

---
## Naming Conventions
Naming conventions can help programmers identify what kind of variable/method they are looking at.
There are various ways to name things in programming, thus having a naming convention will help the code be more readable.

- In naming a variable and method, we will use **camel case.**
```java
public class Main {
    public static void main(String[] args) {
        int age = 10;
        String firstName = "John Mark";
        
        printAge(age);
    }

    public static void printAge(int ageParam) {
        System.out.println("Age: " + age);
    }
}
// see that the variable names are separated by 
// the first uppercase letter of the next word
```

- In naming a class, we will use **pascal case.**
```java
public class MyNewClass {
    
}
// similar to a camel case, the difference is that
// the first letter is also uppercase
```

- In naming a constant variable, we will use **uppercase snake case.**
```java
public class Main {
    public static void main(String[] args) {
        final double PI = 3.14;
        final String AUTHOR_FULL_NAME = "John Mark Santos Dela Cruz";
    }
}
// see that the variable names are separated by 
// an underscore and all are in uppercase
```

## How to Name Things in Programming
Naming conventions can help other programmers to identify what they are looking at, however, it is not enough if the variables, methods, and class are poorly named.

> Examples of poorly named variables and methods are:

``` java
// Do not use same identifier and just add numbers at the end
String firstName1 = "John";
String firstName2 = "Mark";

// Stop using single letters as variable, wtf even is y?????
int y = 5;

// Do not use acronyms that everyone is not familiar with
// how would I know that SOL is speed of light?
final int SOL = 299792458 ;

// Do not just cut the words pls
// FCLTY could be facility or faculty, so which is it?
public static void movToFcltyDatabs(){}
```
Programming would be more fun if you are reading someone's code, and it already tells you what is happening in their code.
> Example of a fun and fun't code:

```java
public class Main {
    public static void main(String[] args) {
        String password1 = "password123";
        String password2 = "abcd12345";

        if(password1 == password2){
            login();
        }else {
            failed();
        }
    }
    public static void login(){
        System.out.println("Welcome User!");
    }
    public static void failed(){
        System.out.println("Wrong Password, try again");
    }
}
// ======================================================================
public class Main {
    public static void main(String[] args) {
        final String CORRECT_PASSWORD = "password123";
        final String ATTEMPT_PASSWORD = "abcd12345";

        if(ATTEMPT_PASSWORD == CORRECT_PASSWORD){
            successfulLogin();
        }else {
            failedLogin();
        }
    }
    public static void successfulLogin(){
        System.out.println("Welcome User!");
    }
    public static void failedLogin(){
        System.out.println("Wrong Password, try again");
    }
}
```

> Which one is more readable? 

There's a bunch of way to name things in programming, just do not sacrifice the readability of your code for shorter variable names.

> Here are some of my rule of thumbs:
```java
// be descriptive
final String CORRECT_PASSWORD = "password123";

// do not abbreviate
double finGrd = 1.37;           // ❌
double finalGrade = 1.37        // ✅

// be more specific (terms and condiitons applies)
// if there will be more of that variable, be descriptive
double finalGradeFirstSemester = 1.37
double finalGradeSecondSemester = 1.37 

// use first word to group them 
double firstSemesterMidtermGrade = 1.37
double firstSemesterFinalGrade = 1.37
double firstSemesterAverageGrade = 1.37

// add units if you are calculating stuffs
int delay = 100;                // 100 what? seconds, ms?
int delayInMilliseconds = 100;  // better

// use verbs in naming methods (handle, get, put, move, clear, etc.)
public static void handleUsernameValidation(){}
public static void clearHashTableIndex(){}
public static void getUserObject(){}
public static void createNewUser(){}
public static void appendToLinkedListNode(){}
```

> However, different conditions may still apply for naming things. You might still
> encounter `user1` `user2` `user3` names if you are using it for debugging. 
> This is just a little context on how you should name things for final production.
