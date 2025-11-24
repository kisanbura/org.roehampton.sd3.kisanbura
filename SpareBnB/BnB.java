import java.util.List;

public class BnB extends Accommodation {

    private int roomCount; // NEW unique field

    public BnB(String name, String location, double pricePerNight, int capacity,
               List<Facility> facilities, int roomCount) {

        super(name, location, pricePerNight, capacity, facilities);
        this.roomCount = roomCount;
    }

    @Override
    public String getDescription() {
        return "A cosy Bed & Breakfast with " + roomCount + " rooms.";
    }
}
