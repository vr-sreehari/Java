package BusReserve;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Booking {
	private String passengerName;
	private int busNo;
	private Date date;

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

	public boolean isAvailable(ArrayList<Booking> booking, ArrayList<Bus> buses) {
		int capacity = 0;
		for (Bus bus : buses) {
			if (bus.getBusNo() == busNo)
				capacity = bus.getCapacity();
		}
		int booked = 0;
		for (Booking b : booking) {
			if (b.busNo == busNo && b.date.equals(date))
				booked++;
		}
		return booked < capacity;
	}
}
