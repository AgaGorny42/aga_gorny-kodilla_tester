package com.kodilla.abstracts.basic_assertion;

public class Application {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;

        int sumResult = calculator.sum(a, b);
        boolean correct = ResultChecker.assertEquals(13, sumResult);
        if (correct) {
            System.out.println("Metoda sum dziala poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie dziala poprawnie dla liczb " + a + " i " + b);
        }

        int subtractResult = calculator.subtract(a, b);
        boolean correct1 = ResultChecker.assertEquals(-3, subtractResult);
        if(correct1) {
            System.out.println("Metoda subtract dziala poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda subtract nie dziala poprawnie dla liczb " + a + " i " + b);
        }

        double powResult = calculator.pow(a, b);
        boolean correct2= ResultChecker.assertEquals((double) 390625, powResult);
        if(correct2) {
            System.out.println("Metoda pow dziala poprawnie dla liczb " + a + " i " + b + " Poprawny wynik: " + powResult);
        }else {
            System.out.println("Metoda pow nie dziala poprawnie dla liczb " + a + " i " + b);
        }
    }
}
