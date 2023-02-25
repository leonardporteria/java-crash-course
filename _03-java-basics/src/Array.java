public class Array {
    public static void main(String[] args) {
        // arrays
        String[] animals = {"Dog", "Cat", "Bird", "Fish", "Chicken"};
        animals[2] = "Bats";

        // empty array
        int[] winningCombination = new int[6];
        winningCombination[0] = 58;
        winningCombination[1] = 38;
        winningCombination[2] = 16;
        winningCombination[3] = 27;
        winningCombination[4] = 3;
        winningCombination[5] = 56;


        // 2d array
        int[][] possiblePins = {{1, 2, 3, 4}, {5, 6, 7, 8}};

        // array method
        int arrayLength = winningCombination.length;
        int arrayLength2D = possiblePins[1].length;
        System.out.println("Array Length: 1D:" + arrayLength);
        System.out.println("Array Length: 2D:" + arrayLength2D);

        // iterate through an array of undefined length
        for(int i = 0; i < animals.length; i++){
            System.out.println(animals[i]);
        }
    }
}
