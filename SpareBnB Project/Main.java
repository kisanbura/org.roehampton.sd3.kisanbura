

public class Main {
    public static void main(String[] args) {
        Facility hotelFacility = new Facility("Spa", "Luxury spa and wellness center");
        Facility bnbFacility = new Facility("Garden", "Private garden for guests");
        Facility hostelFacility = new Facility("Laundry", "Self-service laundry facilities");
        Facility motelFacility = new Facility("Parking", "Free on-site parking");

        Accommodation hotel = new Hotel("Seaside Grand Resort", "Bournemouth", 175.50, 3, hotelFacility,
                5, true, true, true);
        Accommodation bnb = new BnB("Maple Cottage BnB", "Bath", 95.70, 2, bnbFacility,
                true, true, true);
        Accommodation hostel = new Hostel("The Wanderer's Lodge", "Liverpool", 45.00, 12, hostelFacility,
                5, true, true, true);
        Accommodation motel = new Motel("Highway Haven Motel", "Bristol", 55.25, 4, motelFacility,
                true, true, false);

        hotel.printDetails();
        bnb.printDetails();
        hostel.printDetails();
        motel.printDetails();

        int nights = 4;
        System.out.println("Total cost for " + hotel.getName() + " for " + nights + " nights: £" + hotel.getTotalPrice(nights));
    }
}

