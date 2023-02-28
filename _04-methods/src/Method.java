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
