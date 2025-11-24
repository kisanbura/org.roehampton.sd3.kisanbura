import java.util.List;

public class Hostel extends Accommodation {

    private int dormRooms; //unique property

    public Hostel(String name, String location, double pricePerNight, int capacity,
                  List<Facility> facilities, int dormRooms) {
        super(name, location, pricePerNight, capacity, facilities);
        this.dormRooms = dormRooms;
    }

    @Override
    public String getDescription() {
        return "Hostel with " + dormRooms + " shared dorm rooms";
    }
}
