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
