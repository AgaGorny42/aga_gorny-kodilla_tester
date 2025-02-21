package com.kodilla.abstracts.homework;

public class PersonApplication {
    public static void main(String[] args) {

        Firefighter firefighter =  new Firefighter();
//        System.out.println(firefighter.responsibilities);

        Politician politician = new Politician();
//        System.out.println(politician.responsibilities);

        Teacher teacher = new Teacher();
//        System.out.println(teacher.responsibilities);

        Person person = new Person("Jan", 50, firefighter);
        Person person1 = new Person("Daniel", 40, politician);
        Person person2 = new Person("Katarzyna", 29, teacher);
        person.displayResponsibilities();
        person1.displayResponsibilities();
        person2.displayResponsibilities();

    }
}
