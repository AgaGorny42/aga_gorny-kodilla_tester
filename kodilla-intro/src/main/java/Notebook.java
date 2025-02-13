public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }
    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        } else if (this.price <= 1000) {
            System.out.println("The price is good.");
        } else {
            System.out.println("This notebook is expensive.");
        }
    }
    public void checkWeight() {
        if (this.weight  <= 900) {
            System.out.println("This is a lightweight notebook.");
        }
        else if (this.weight <= 1900) {
            System.out.println("The weight of this notebook is reasonable.");
        }
        else {
            System.out.println("The notebook is heavy.");
        }
    }
    public void checkyear() {
        if (this.year < 2010 ) {
            System.out.println("The notebook released in " + this.year + " is old and cannot cost more than " + this.price + " euros.");
        }
        else if (this.year < 2020) {
            System.out.println("This notebook is too expensive as for the one made in " + this.year + ".");
        }
        else {
            System.out.println("The notebooks made after " + this.year + " are expensive.");
        }
    }

    }
