import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {

        Exersise exersise = new Exersise("Adam", 40.5, 178);
        System.out.println(exersise.name + " " + exersise.age + " " + exersise.height + " ");
        exersise.checkName();
    }
}
