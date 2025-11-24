import java.util.List;

public abstract class Accommodation {

    private String name;
    private String location;
    private double pricePerNight;
    private int capacity;
    private List<Facility> facilities;

    private User bookedBy = null; // Null = available

    public Accommodation(String name, String location, double pricePerNight,
                         int capacity, List<Facility> facilities) {

        this.name = name;
        this.location = location;
        this.pricePerNight = pricePerNight;
        this.capacity = capacity;
        this.facilities = facilities;
    }

    // ----------- Getters -----------
    public String getName() { return name; }
    public String getLocation() { return location; }
    public double getPricePerNight() { return pricePerNight; }
    public int getCapacity() { return capacity; }
    public List<Facility> getFacilities() { return facilities; }
    public User getBookedBy() { return bookedBy; }

    // ----------- Booking Logic -----------
    public boolean book(User user) {
        if (bookedBy != null) return false;
        bookedBy = user;
        return true;
    }

    public void releaseBooking() {
        if (bookedBy != null) {
            System.out.println(bookedBy.getFullName() + " has released booking for " + name);
            bookedBy = null;
        }
    }

    public double getTotalPrice(int nights) {
        return pricePerNight * nights;
    }

    // Every subclass must explain itself
    public abstract String getDescription();

    // ----------- Printing Details -----------
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
