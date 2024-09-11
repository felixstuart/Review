/**
 * CS2 Review Assignment!
 * Do NOT use ChatGPT or any other generative AI to assist you with this assignment
 * You may reference your own past work and the internet (not including AI)
 */

public class JavaBeansAndBytes {

    // Variables for the CoffeeShop
    String name;
    boolean isOpen;
    int yearFounded;

    public static void main(String[] args) {
        // Create a new CoffeeShop instance to run everything.
        JavaBeansAndBytes cafe = new JavaBeansAndBytes();
    }

    // Constructor for CoffeeShop
    public JavaBeansAndBytes() {
        name = "Java Beans & Bytes: The Code Café";
        isOpen = true;
        yearFounded = 1995;

        System.out.println("Welcome to " + name + "!");
        if (isOpen) {
            System.out.println("We are open!");
        } else {
            System.out.println("We are closed :(");
        }
        System.out.println("We were founded in " + yearFounded + ".");

        this.yearFounded = 2024;
        System.out.println("We were founded in "+yearFounded+".");

        // Calling methods
        randomDiscount();
        // Add parameter to specialOfTheDay (drink of your choice)
        specialOfTheDay("Latte");
        countCups();
        baristasChoice();

        CoffeeDrink latte = new CoffeeDrink(4, "Latte", false);
        CoffeeDrink PumpkinSpice = new CoffeeDrink(1, "Pumpkin", true);

        latte.printInfo();
        PumpkinSpice.printInfo();
    }

    // Method to generate a random discount
    public void randomDiscount() {
        int randomDiscount = (int) Math.floor(Math.random()*31);
        System.out.println("Random Discount: "+randomDiscount+" %");
    }

    // Method with a parameter for the special of the day
    public void specialOfTheDay(String special) {
        System.out.println("Today's Special is "+special);
    }

    // Method to show loops
    public void countCups() {
        System.out.println("Counting cups sold today:");

        // Write three different for loops that print the indicated numbers:

        // Print 1 to 5
        for (int i = 1; i <= 5; i++) {
            System.out.print(i);
        }
        System.out.println();
        // Print 2, 5, 8, 11
        for (int i = 2; i <= 11; i+=3) {
            System.out.print(i);
        }
        System.out.println();
        // Print 8 to 0
        for (int i = 8; i >= 0 ; i--) {
            System.out.print(i);
        }
        System.out.println();
    }
    // Method to recommend a coffee based on a random number
    public void baristasChoice() {
        double random = Math.floor(Math.random());

        if (random == 0.2) {
            System.out.println("Barista's Choice is a Latte");
            return;
        }
        if (random == 0.6) {
            System.out.println("Barista's Choice is a Black Coffee");
            return;
        }
        if (random == 0.8) {
            System.out.println("Barista's Choice is an Espresso");
        } else {
            System.out.println("Barista's Choice is a Cappuccino");
        }
    }
}

