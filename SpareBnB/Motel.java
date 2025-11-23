public class Motel extends Accommodation {
    private boolean parkingAvailable;
    private boolean hasEVCharging;
    private boolean petFriendly;

    public Motel(String name, String location, double pricePerNight, int capacity, Facility facility,
                 boolean parkingAvailable, boolean hasEVCharging, boolean petFriendly) {
        super(name, location, pricePerNight, capacity, facility);
        this.parkingAvailable = parkingAvailable;
        this.hasEVCharging = hasEVCharging;
        this.petFriendly = petFriendly;
    }

    @Override
    public String getDescription() {
        return "Motel with " +
                (parkingAvailable ? "parking, " : "") +
                (hasEVCharging ? "EV charging, " : "") +
                (petFriendly ? "pet friendly" : "no pets allowed");
    }
}

