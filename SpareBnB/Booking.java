public class Booking {

    private User user;
    private Accommodation accommodation;
    private int nights;
    private double totalCost;
    private boolean successful;

    public Booking(User user, Accommodation accommodation, int nights) {

        this.user = user;
        this.accommodation = accommodation;
        this.nights = nights;

        // Attempt booking
        successful = accommodation.book(user);

        if (successful) {
            totalCost = accommodation.getTotalPrice(nights);
            System.out.println("Booking successful for " + user.getFullName() +
                    " at " + accommodation.getName());
        } else {
            totalCost = 0;
            System.out.println("Cannot create booking for " + user.getFullName() +
                    ". Accommodation " + accommodation.getName() +
                    " is already booked by " + accommodation.getBookedBy().getFullName() +
                    " and unavailable.");
        }
    }

    public boolean isSuccessful() { return successful; }

    public void releaseBooking() {
        if (successful) {
            accommodation.releaseBooking();
            successful = false;
            totalCost = 0;
        }
    }

    public void printBookingDetails() {
        if (successful) {

            System.out.println("== BOOKING CONFIRMATION ==");
            user.printUser();
            accommodation.printDetails();
            System.out.println("Nights: " + nights);
            System.out.println("Total Cost: £" + totalCost);
            System.out.println("===========================");

        } else {

            System.out.println("== BOOKING UNAVAILABLE ==");
            System.out.println(user.getFullName() + " could not book "
                    + accommodation.getName() + ".");
            System.out.println("Currently booked by: " +
                    accommodation.getBookedBy().getFullName());
            System.out.println("------------------------------------");
        }
    }
}
