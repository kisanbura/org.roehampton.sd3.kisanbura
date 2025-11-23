public class Facility {
    private String name;
    private String description;

    // Constructor
    public Facility(String name, String description) {
        this.name = name;
        this.description = description;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    // Method to print details
    public void printFacility() {
        System.out.println("Facility: " + name + " - " + description);
    }
}
