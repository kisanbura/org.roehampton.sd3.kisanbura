public class Booking {

    private User user;   //links user to booking
    private Accommodation accommodation;   //links accom
    private int nights;   //tracks number of nights
    private double totalCost;
    private boolean successful; //success state

    public Booking(User user, Accommodation accommodation, int nights) {

        this.user = user;    //creates a booking attempt
        this.accommodation = accommodation;
        this.nights = nights;

        // Attempt booking
        successful = accommodation.book(user); //calls accommodation.book()
        // if bookedBy is null - success
        // if already booked - returns false

        if (successful) {
            totalCost = accommodation.getTotalPrice(nights);   // if successful calculates full cost
            System.out.println("Booking successful for " + user.getFullName() +
                    " at " + accommodation.getName()); // confirmation message
        } else {
            totalCost = 0;
            System.out.println("Cannot create booking for " + user.getFullName() +
                    ". Accommodation " + accommodation.getName() +
                    " is already booked by " + accommodation.getBookedBy().getFullName() +
                    " and unavailable.");      // shows who already booked it if not successful
        }
    }

    public boolean isSuccessful() { return successful; }

    public void releaseBooking() {  //release booking
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
