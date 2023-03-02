public class Wonderpets {
    static int numberOfPets;
    String petName;

    Wonderpets(String petName) {
        this.petName = petName;
        numberOfPets++;
    }

    void displayPetName() {
        System.out.println("Your pet is " + this.petName);
    }

    static void displayPetNumbers() {
        System.out.println("You have " + numberOfPets + " Wonderpets");
    }
}
