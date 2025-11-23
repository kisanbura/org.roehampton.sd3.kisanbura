public class Booking {
    private User user;
    private Accommodation accommodation;
    private int nights;
    private double totalCost;

    public Booking(User user, Accommodation accommodation, int nights) {
        this.user = user;
        this.accommodation = accommodation;
        this.nights = nights;
        this.totalCost = accommodation.getTotalPrice(nights);
    }

    public void printBookingDetails() {
        System.out.println("======== BOOKING CONFIRMATION ========");
        user.printUser();
        accommodation.printDetails();
        System.out.println("Nights: " + nights);
        System.out.println("Total Cost: £" + totalCost);
        System.out.println("======================================");
    }
}
