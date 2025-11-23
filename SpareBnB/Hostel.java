public class Hostel extends Accommodation {
    private int dormRooms;
    private boolean sharedKitchen;
    private boolean hasLaundryRoom;
    private boolean hasLoungeArea;

    public Hostel(String name, String location, double pricePerNight, int capacity, Facility facility,
                  int dormRooms, boolean sharedKitchen, boolean hasLaundryRoom, boolean hasLoungeArea) {
        super(name, location, pricePerNight, capacity, facility);
        this.dormRooms = dormRooms;
        this.sharedKitchen = sharedKitchen;
        this.hasLaundryRoom = hasLaundryRoom;
        this.hasLoungeArea = hasLoungeArea;
    }

    @Override
    public String getDescription() {
        return "Hostel with " + dormRooms + " dorm rooms, " +
                (sharedKitchen ? "shared kitchen, " : "") +
                (hasLaundryRoom ? "laundry room, " : "") +
                (hasLoungeArea ? "lounge area" : "");
    }
}

