public class User {

    int age;
    String name;

    public User(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public static void main(String[] args) {
        User[] users = new User[10];

        users[0] = new User(20, "Kasia");
        users[1] = new User(42, "Tomek");
        users[2] = new User(8, "Tymek");

        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum = (sum + users[i].age);
        }
        float average = sum / 3;
        System.out.println("average: " + average);


        for (int i = 0; i < 3; i++) {
            if (users[i].age < average) {
                System.out.println(users[i].name);
            }
        }
    }
}

