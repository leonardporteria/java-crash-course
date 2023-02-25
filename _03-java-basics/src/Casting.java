public class Casting {
    public static void main(String[] args) {
        // casting (primitive data types)
        int integerNumber = 18;
        double decimalNumber = integerNumber;

        System.out.println(integerNumber);
        System.out.println(decimalNumber);

        // parsing
        String myStringNumber = "15";
        int myIntNumber = Integer.parseInt(myStringNumber);
        double myDoubleNumber = Double.parseDouble(myStringNumber);

        System.out.println(myIntNumber);
        System.out.println(myDoubleNumber);

    }
}
