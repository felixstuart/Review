// CoffeeDrink object class

class CoffeeDrink {

    private int numberOfCups;
    private String flavor;
    private boolean hasWhippedCream;

    // Constructor for CoffeeDrink class
    public CoffeeDrink() {
        this.numberOfCups = 1;
        this.flavor = "flavor";
        this.hasWhippedCream = false;
    }

    // Method to print information about the CoffeeDrink
    public void printInfo() {
        System.out.println("Number of Cups: " + numberOfCups + " flavor: " + flavor + (hasWhippedCream ? " has whipped cream" : " does not have whipped cream"));
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public void setNumberOfCups(int numberOfCups) {
        this.numberOfCups = numberOfCups;
    }

    public void setHasWhippedCream(boolean hasWhippedCream) {
        this.hasWhippedCream = hasWhippedCream;
    }

    public int getNumberOfCups() {
        return numberOfCups;
    }

    public String getFlavor() {
        return flavor;
    }

    public boolean getHasWhippedCream() {
        return hasWhippedCream;
    }
}
