public class Main {
    public static void main(String[] args) {

        // Facilities
        Facility hotelFacility = new Facility("Spa", "Luxury spa and wellness center");
        Facility bnbFacility = new Facility("Garden", "Private garden for guests");
        Facility hostelFacility = new Facility("Laundry", "Self-service laundry facilities");
        Facility motelFacility = new Facility("Parking", "Free on-site parking");

        // Accommodations
        Accommodation hotel = new Hotel("Seaside Grand Resort", "Bournemouth", 175.50, 3, hotelFacility, 5, true, true, true);
        Accommodation bnb = new BnB("Maple Cottage BnB", "Bath", 95.70, 2, bnbFacility, true, true, true);
        Accommodation hostel = new Hostel("The Wanderer's Lodge", "Liverpool", 45.00, 12, hostelFacility, 5, true, true, true);

        // ---------- SPRINT 2 REQUIREMENT: AT LEAST 3 USERS ----------
        User user1 = new User("Michael", "Olu", 123456789, "02/02/2000");
        User user2 = new User("Sarah", "Johnson", 987654321, "15/07/1998");
        User user3 = new User("Daniel", "Moses", 555888111, "04/11/2001");

        // ---------- BOOKINGS FOR EACH USER ----------
        Booking booking1 = new Booking(user1, hotel, 4);
        Booking booking2 = new Booking(user2, bnb, 2);
        Booking booking3 = new Booking(user3, hostel, 6);

        // ---------- PRINT BOOKING CONFIRMATIONS ----------
        booking1.printBookingDetails();
        booking2.printBookingDetails();
        booking3.printBookingDetails();
    }
}
