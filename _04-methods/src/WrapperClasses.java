public class WrapperClasses {
    public static void main(String[] args) {
        Integer myInteger = 18;
        Double myDouble = 3.89;
        Character myChar = 'a';

        System.out.println(myInteger.doubleValue());
        System.out.println(myDouble.intValue());
        System.out.println(myChar.hashCode());
    }
}
