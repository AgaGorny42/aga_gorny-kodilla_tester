public class ReadRandomNumbers {
    public static void main(String[] args) {

        RandomNumbers randomNumbers = new RandomNumbers();
        randomNumbers.getRandomNum();
        int maximum =  randomNumbers.getMaxNum();
        System.out.println("The random maximun number is: " + maximum);
        int minimum = randomNumbers.getMinNum();
        System.out.println("The random minimum number is: " + minimum);
    }
}
