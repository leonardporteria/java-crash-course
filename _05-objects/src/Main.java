public class Main {
    public static void main(String[] args) {
        Mouse myLogifakeMouse = new Mouse("Logifake", 800, 6, false, true);

        System.out.println(myLogifakeMouse.brand);
        System.out.println(myLogifakeMouse.programmable);

        Mouse myA4TechMouse = new Mouse("A4 Tech", 1200, 4, true, false);
        System.out.println(myA4TechMouse.brand);
        System.out.println(myA4TechMouse.programmable);
    }
}
