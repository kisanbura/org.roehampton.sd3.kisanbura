import java.util.List;

public class BnB extends Accommodation {

    private int roomCount; //unique property

    public BnB(String name, String location, double pricePerNight, int capacity, //constructor
               List<Facility> facilities, int roomCount) {

        super(name, location, pricePerNight, capacity, facilities);
        this.roomCount = roomCount;
    }

    @Override
    public String getDescription() {
        return "A cosy Bed & Breakfast with " + roomCount + " rooms."; //description
    }
}
