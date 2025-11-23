public class BnB extends Accommodation {
    private boolean breakfastIncluded;
    private boolean privateBathroom;
    private boolean hasGarden;

    public BnB(String name, String location, double pricePerNight, int capacity, Facility facility,
               boolean breakfastIncluded, boolean privateBathroom, boolean hasGarden) {
        super(name, location, pricePerNight, capacity, facility);
        this.breakfastIncluded = breakfastIncluded;
        this.privateBathroom = privateBathroom;
        this.hasGarden = hasGarden;
    }

    @Override
    public String getDescription() {
        return (breakfastIncluded ? "Breakfast included, " : "") +
                (privateBathroom ? "Private bathroom, " : "Shared bathroom, ") +
                (hasGarden ? "Has a garden" : "No garden");
    }
}
