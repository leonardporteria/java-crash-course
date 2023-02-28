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
