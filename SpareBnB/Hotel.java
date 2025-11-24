import java.util.List;

public class Hotel extends Accommodation {

    private int starRating; //property unique to hotel

    public Hotel(String name, String location, double pricePerNight, int capacity,   //constructor for hotel
                 List<Facility> facilities, int starRating) {
        super(name, location, pricePerNight, capacity, facilities); //calling parent class constructor
        this.starRating = starRating;   //saves hotel specific info
    }

    @Override
    public String getDescription() {    // polymorphism - each subclass has own description
        return starRating + "★ luxury hotel";
    }
}
