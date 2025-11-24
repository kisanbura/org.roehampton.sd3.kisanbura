import java.util.List;

public abstract class Accommodation {

    private String name;
    private String location;
    private double pricePerNight;
    private int capacity;
    private List<Facility> facilities;
    private User bookedBy = null;

    public Accommodation(String name, String location, double pricePerNight, int capacity, List<Facility> facilities) {
        this.name = name;
        this.location = location;
        this.pricePerNight = pricePerNight;
        this.capacity = capacity;
        this.facilities = facilities;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public int getCapacity() {
        return capacity;
    }

    public List<Facility> getFacilities() {
        return facilities;
    }

    public User getBookedBy() {
        return bookedBy;
    }

    /**
     * Attempts to book the accommodation.
     * Prints NOTHING — to avoid double-printing.
     */
    public boolean book(User user) {
        if (bookedBy != null) {
            return false; // Already booked
        }
        bookedBy = user;
        return true; // Booking successful
    }

    /**
     * Releases accommodation for another user.
     */
    public void releaseBooking() {
        if (bookedBy != null) {
            System.out.println(bookedBy.getFullName() + " has released booking for " + name);
            bookedBy = null;
        }
    }

    /**
     * Calculates total price.
     */
    public double getTotalPrice(int nights) {
        return pricePerNight * nights;
    }

    /**
     * Each accommodation type must describe itself.
     */
    public abstract String getDescription();

    /**
     * Prints full accommodation details.
     */
    public void printDetails() {
        System.out.println("Accommodation: " + name);
        System.out.println("Location: " + location);
        System.out.println("Price per night: £" + pricePerNight);
        System.out.println("Capacity: " + capacity);

        System.out.println("Facilities:");
        for (Facility f : facilities) {
            System.out.println(" - " + f.getName() + ": " + f.getDescription());
        }

        System.out.println("Description: " + getDescription());

        if (bookedBy == null) {
            System.out.println("Status: Available");
        } else {
            System.out.println("Status: Booked by " + bookedBy.getFullName());
        }

        System.out.println("---------------------------------------");
    }
}
