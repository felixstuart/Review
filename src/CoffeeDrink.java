// CoffeeDrink object class

class CoffeeDrink {

    int numberOfCups;
    String flavor;
    boolean hasWhippedCream;

    // Constructor for CoffeeDrink class
    public CoffeeDrink(int numberOfCups, String flavor, boolean hasWhippedCream) {
        this.numberOfCups = numberOfCups;
        this.flavor = flavor;
        this.hasWhippedCream = hasWhippedCream;
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

    public boolean isHasWhippedCream() {
        return hasWhippedCream;
    }
}
