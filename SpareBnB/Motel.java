import java.util.List;

public class Motel extends Accommodation {

    private int parkingSpaces; // NEW unique field

    public Motel(String name, String location, double pricePerNight, int capacity,
                 List<Facility> facilities, int parkingSpaces) {

        super(name, location, pricePerNight, capacity, facilities);
        this.parkingSpaces = parkingSpaces;
    }

    @Override
    public String getDescription() {
        return "A roadside Motel with " + parkingSpaces + " parking spaces.";
    }
}
