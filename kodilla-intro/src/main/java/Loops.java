

public class Loops {
    public static void main(String[] args) {
        int[] numbers = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum = 0;
        for (int i = 0; i <numbers.length; i=i+1){
            System.out.println("Num[" + i + "]=" + numbers[i]);
            sum = sum + numbers[i];
        }
        System.out.println("Suma = " + sum);

        }
    }




