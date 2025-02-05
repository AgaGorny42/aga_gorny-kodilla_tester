public class SimpleArray {
    public static void main(String[] args) {
        String[] farmAnimals = new String[5];

        farmAnimals[0] = "a dog";
        farmAnimals[1] = "a cat";
        farmAnimals[2] = "a cow";
        farmAnimals[3] = "a horse";
        farmAnimals[4] = "a donkey";

        String farmAnimal = farmAnimals[3];
        System.out.println(farmAnimal);

        int numberOfElements = farmAnimals.length;
        System.out.println("Moja tablica zawiera " + numberOfElements + " elementow");

    }
}
