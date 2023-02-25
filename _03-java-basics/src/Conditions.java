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
