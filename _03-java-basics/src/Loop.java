public class Loop {
    public static void main(String[] args) {
        int index = 0;
        // while
        while (index <= 5){
            index++;
            System.out.println(index);
        }
        // do while
        do {
            index++;
            if(index == 4) continue;
            System.out.println(index);
        } while (index <= 10);

        // for
        for (int i = 0; i < 5; i++){
            if (i == 3) break;
            System.out.println(i);
        }

        // foreach
        String[] animals = {"Dog", "Cat", "Bird", "Fish", "Chicken"};
        // (singleElement : Array)
        for (String animal : animals) {
            System.out.println(animal);
        }
    }
}
