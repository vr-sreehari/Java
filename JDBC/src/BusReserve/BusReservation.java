package BusReserve;

import java.util.Scanner;

public class BusReservation {

	public static void main(String[] args) {

		BusDAO bus = new BusDAO();
		try {
			bus.getBusInfo();

			Scanner scanner = new Scanner(System.in);
			int userOpt = 1;

			while (userOpt == 1) {
				System.out.println("Do you want to Continue Booking...1 or 2?");
				userOpt = scanner.nextInt();
				if (userOpt == 1) {
					Booking booking = new Booking();
					if (booking.isAvailable()) {
						BookingDAO booked = new BookingDAO();
						booked.addBooking(booking);
						System.out.println("your booking is Confirmed..");
					} else
						System.out.println("Try a different bus or date");
				}
			}
			scanner.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
