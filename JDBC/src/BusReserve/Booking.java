package BusReserve;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Booking {
	String passengerName;
	int busNo;
	Date date;

	Booking() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Your name:");
		passengerName = scanner.next();
		System.out.println("Enter Bus Number:");
		busNo = scanner.nextInt();
		System.out.println("Enter data dd-mm-yyyy:");
		String getDate = scanner.next();
		SimpleDateFormat date1 = new SimpleDateFormat("dd-MM-yyyy");
		try {
			date = date1.parse(getDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public boolean isAvailable() throws SQLException {
		BusDAO bus = new BusDAO();
		BookingDAO booking = new BookingDAO();

		int capacity = bus.getCapacity(busNo);
		int booked = booking.getBooked(busNo, date);
		return booked < capacity;
	}
}
