import java.lang.Math;

public class BuiltIn {
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

        // equals(sequence of chars (String))
        // (return boolean)
        boolean isEqualsTo = myString.contains("Hello World!");
        System.out.println(isEqualsTo);

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
