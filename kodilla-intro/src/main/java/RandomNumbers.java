import java.util.concurrent.ThreadLocalRandom;

public class RandomNumbers {
    int min;
    int max;

    public void getRandomNum() {
        int sum = 0;
        for (int i =0; sum < 5000; i = 1) {
            int randomNum = ThreadLocalRandom.current().nextInt(0, 31);
            System.out.println(randomNum);
            sum = (sum + randomNum);
            if (i == 0) {
                min = randomNum;
                max = randomNum;
            }
            if (randomNum > max) {
                System.out.println("The random maximun number is: " + randomNum);
                max = randomNum;
            }
            if (randomNum < min) {
                System.out.println("The random minimum number is: " + randomNum);
                min = randomNum;
            }
        }
    }
    public int getMinNum() {
        return min;
    }
    public int getMaxNum() {
        return max;
    }
}
