public class Scope {

    // instance variables
    public int age = 10;
    static String name = "Juan";

    public static void main(String[] args) {
        Scope myScope = new Scope();

        System.out.println(myScope.age);
        System.out.println(name);
    }

    static int getAge() {
        return new Scope().age;
    }
}
