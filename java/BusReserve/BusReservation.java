package BusReserve;

import java.util.ArrayList;
import java.util.Scanner;

public class BusReservation {

	public static void main(String[] args) {
		ArrayList<Bus> buses = new ArrayList<Bus>();
		ArrayList<Booking> bookings = new ArrayList<Booking>();

		buses.add(new Bus(1, true, 2));
		buses.add(new Bus(2, false, 45));
		buses.add(new Bus(3, true, 20));

		for (Bus b : buses) {
			b.getBusInfo();
		}

		Scanner scanner = new Scanner(System.in);
		int userOpt = 1;

		while (userOpt == 1) {
			System.out.println("Do you want to Continue Booking...1 or 2?");
			userOpt = scanner.nextInt();
			if (userOpt == 1) {
				Booking booking = new Booking();
				if (booking.isAvailable(bookings, buses)) {
					bookings.add(booking);
					System.out.println("your booking is Confirmed..");
				} else
					System.out.println("Try a different bus or date");

			}

		}

	}

}
