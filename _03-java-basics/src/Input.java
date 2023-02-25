import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String username;

        System.out.println("Enter Username: ");
        username = myScanner.nextLine();

        System.out.println("Your Username is " + username);
    }
}
