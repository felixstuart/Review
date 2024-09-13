// CoffeeDrink object class

class CoffeeDrink {

    private int numberOfCups;
    private String flavor;
    private boolean hasWhippedCream;

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

    public int getNumberOfCups() {
        return this.numberOfCups;
    }
    public String getFlavor() {
        return this.flavor;
    }
    public boolean getHasWhippedCream() {
        return this.hasWhippedCream;
    }

    public void setNumberOfCups(int numberOfCups) {
        this.numberOfCups = numberOfCups;
    }
    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }
    public void setHasWhippedCream(boolean hasWhippedCream) {
        this.hasWhippedCream = hasWhippedCream;
    }
}
