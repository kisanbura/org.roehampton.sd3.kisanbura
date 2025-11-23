public class Hotel extends Accommodation {
    private int starRating;
    private boolean hasRestaurant;
    private boolean hasGym;
    private boolean hasPool;

    public Hotel(String name, String location, double pricePerNight, int capacity, Facility facility,
                 int starRating, boolean hasRestaurant, boolean hasGym, boolean hasPool) {
        super(name, location, pricePerNight, capacity, facility);
        this.starRating = starRating;
        this.hasRestaurant = hasRestaurant;
        this.hasGym = hasGym;
        this.hasPool = hasPool;
    }

    @Override
    public String getDescription() {
        return starRating + "★ Hotel with" +
                (hasRestaurant ? " restaurant," : "") +
                (hasGym ? " gym," : "") +
                (hasPool ? " pool." : "");
    }
}
