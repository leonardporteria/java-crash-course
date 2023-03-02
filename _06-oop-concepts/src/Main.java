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