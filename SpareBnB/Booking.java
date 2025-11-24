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

        // Try to book via the accommodation
        this.successful = accommodation.book(user);

        if (successful) {
            this.totalCost = accommodation.getTotalPrice(nights);
            System.out.println("Booking successful for " + user.getFullName()
                    + " at " + accommodation.getName());
        } else {
            this.totalCost = 0;
            if (accommodation.getBookedBy() != null) {
                System.out.println("Cannot create booking for " + user.getFullName()
                        + ". Accommodation " + accommodation.getName()
                        + " is already booked by " + accommodation.getBookedBy().getFullName()
                        + " and unavailable.");
            } else {
                System.out.println("Cannot create booking for " + user.getFullName()
                        + ". Accommodation " + accommodation.getName()
                        + " is unavailable.");
            }
        }
    }

    public boolean isSuccessful() {
        return successful;
    }

    public void releaseBooking() {
        if (successful) {
            accommodation.releaseBooking();
            successful = false;
            totalCost = 0;
        } else {
            System.out.println("No active booking to release for " + user.getFullName()
                    + " on " + accommodation.getName());
        }
    }

    public void printBookingDetails() {
        if (successful) {
            System.out.println("======== BOOKING CONFIRMATION ========");
            user.printUser();
            accommodation.printDetails();
            System.out.println("Nights: " + nights);
            System.out.println("Total Cost: £" + totalCost);
            System.out.println("======================================");
        } else {
            System.out.println("======== BOOKING UNAVAILABLE ========");
            System.out.println(user.getFullName() + " could not book " + accommodation.getName() + ".");
            if (accommodation.getBookedBy() != null) {
                System.out.println("Currently booked by: " + accommodation.getBookedBy().getFullName());
            }
            System.out.println("---------------------------------------");
        }
    }
}
