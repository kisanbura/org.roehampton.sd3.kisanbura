public abstract class Accommodation {
    private String name;
    private String location;
    private double pricePerNight;
    private int capacity;
    private Facility facility; // Composition: Accommodation has-a Facility

    // Constructor
    public Accommodation(String name, String location, double pricePerNight, int capacity, Facility facility) {
        this.name = name;
        this.location = location;
        this.pricePerNight = pricePerNight;
        this.capacity = capacity;
        this.facility = facility;
    }

    // Getters and Setters (Encapsulation)
    public String getName() { return name; }
    public String getLocation() { return location; }
    public double getPricePerNight() { return pricePerNight; }
    public int getCapacity() { return capacity; }
    public Facility getFacility() { return facility; }
    public void setPricePerNight(double pricePerNight) { this.pricePerNight = pricePerNight; }

    // New Method: Calculate total price for given nights
    public double getTotalPrice(int nights) {
        return pricePerNight * nights;
    }

    // Abstract Method (Abstraction + Polymorphism)
    public abstract String getDescription();

    // Shared Method (common for all subclasses)
    public void printDetails() {
        System.out.println("Accommodation: " + name);
        System.out.println("Location: " + location);
        System.out.println("Price per night: £" + pricePerNight);
        System.out.println("Capacity: " + capacity);
        if (facility != null) {
            System.out.println("Facility: " + facility.getName() + " - " + facility.getDescription());
        }
        System.out.println("Description: " + getDescription());
        System.out.println("---------------------------------------");
    }

}
