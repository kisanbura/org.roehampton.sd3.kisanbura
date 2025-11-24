import java.util.List;

public class Hotel extends Accommodation {

    private int starRating;

    public Hotel(String name, String location, double pricePerNight, int capacity,
                 List<Facility> facilities, int starRating) {
        super(name, location, pricePerNight, capacity, facilities);
        this.starRating = starRating;
    }

    @Override
    public String getDescription() {
        return starRating + "★ luxury hotel";
    }
}
