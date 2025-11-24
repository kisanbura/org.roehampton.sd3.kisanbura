import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Facilities
        List<Facility> hotelFacilities = List.of(
                new Facility("Pool", "Outdoor heated swimming pool"),
                new Facility("Gym", "Fully equipped fitness centre")
        );

        List<Facility> bnbFacilities = List.of(
                new Facility("Garden", "Private outdoor garden"),
                new Facility("Breakfast Area", "Cozy indoor dining space")
        );

        List<Facility> hostelFacilities = List.of(
                new Facility("Laundry", "Self-service laundry facilities"),
                new Facility("Kitchen", "Shared guest kitchen")
        );

        List<Facility> motelFacilities = List.of(
                new Facility("Parking", "Free on-site parking"),
                new Facility("EV Charging", "Electric vehicle charging point")
        );

        // Accommodations
        Accommodation hotel = new Hotel("Seaside Grand Resort", "Bournemouth", 175.50, 3, hotelFacilities, 5);
        Accommodation bnb = new BnB("Maple Cottage BnB", "Bath", 95.70, 2, bnbFacilities, 5); // roomCount = 5
        Accommodation hostel = new Hostel("The Wanderer's Lodge", "Liverpool", 45.00, 12, hostelFacilities, 6);
        Accommodation motel = new Motel("Highway Rest Motel", "Manchester", 60.00, 4, motelFacilities, 20); // parkingSpaces = 20

        // Users
        User user1 = new User("Kisan Bura", 723456789, "02/07/2004", "kisan@gmail.com");
        User user2 = new User("Danny Michael", 787654321, "15/07/2000", "danny@yahoo.com");
        User user3 = new User("Andrea Smith", 755888111, "04/11/2002", "andrea@outlook.com");

        // Bookings
        Booking b1 = new Booking(user1, hotel, 4);
        Booking b2 = new Booking(user2, hotel, 2);
        Booking b3 = new Booking(user3, bnb, 6);
        Booking b4 = new Booking(user2, motel, 1);

        b1.printBookingDetails();
        b2.printBookingDetails();
        b3.printBookingDetails();
        b4.printBookingDetails();

        // Release and rebook
        hotel.releaseBooking();
        Booking b5 = new Booking(user2, hotel, 3);
        b5.printBookingDetails();
    }
}
