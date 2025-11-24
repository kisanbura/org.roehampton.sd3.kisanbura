import java.util.List;

public abstract class Accommodation { //abstract class cannot be directly instantiated.

    private String name; //properties shared by all accommodation
    private String location;
    private double pricePerNight;
    private int capacity;
    private List<Facility> facilities; // composition: accomm has a list of facility objects

    private User bookedBy = null;  // tracks who booked the accom
    // Null = nobody booked = available

    public Accommodation(String name, String location, double pricePerNight, //constructor used by all subclasses
                         int capacity, List<Facility> facilities) {

        this.name = name;       //assigns all values to object properties
        this.location = location;
        this.pricePerNight = pricePerNight;
        this.capacity = capacity;
        this.facilities = facilities;
    }

    // Getters - encapsulation returns all methods
    public String getName() { return name; }
    public String getLocation() { return location; }
    public double getPricePerNight() { return pricePerNight; }
    public int getCapacity() { return capacity; }
    public List<Facility> getFacilities() { return facilities; }
    public User getBookedBy() { return bookedBy; }

    //  Booking Logic
    public boolean book(User user) {
        if (bookedBy != null) return false; // if its already booked -> booking fails
        bookedBy = user;    // otherwise sets user and confirms booking
        return true;
    }

    public void releaseBooking() {     // makes accom available again
        if (bookedBy != null) {
            System.out.println(bookedBy.getFullName() + " has released booking for " + name);
            bookedBy = null;
        }
    }

    public double getTotalPrice(int nights) {
        return pricePerNight * nights;   //calculates full cost
    }

    // Every subclass must explain itself
    public abstract String getDescription();

    //  Printing Details - outputs all accom info
    public void printDetails() {
        System.out.println("Accommodation: " + name);
        System.out.println("Location: " + location);
        System.out.println("Price per night: £" + pricePerNight);
        System.out.println("Capacity: " + capacity);

        System.out.println("Facilities:"); //start listing facilities
        for (Facility f : facilities) {    //for-each loop goes through every facility object in facilities
            System.out.println(" - " + f.getName() + ": " + f.getDescription());
        }

        System.out.println("Description: " + getDescription()); //subclasses use

        if (bookedBy == null) {   //displays current booking status.
            System.out.println("Status: Available");
        } else {
            System.out.println("Status: Booked by " + bookedBy.getFullName());
        }

        System.out.println("---------------------------------------");
    }
}
