package BusReserve;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class BookingDAO {

	public int getBooked(int busNo, Date date) throws SQLException {
		String query = "select count(passengerName) from booking where busNo=? and travelDate=?";
		Connection con = DBconnection.getDBConnection();
		PreparedStatement pst = con.prepareStatement(query);
		java.sql.Date sqldate = new java.sql.Date(date.getTime());
		pst.setInt(1, busNo);
		pst.setDate(2, sqldate);
		ResultSet rs = pst.executeQuery();
		rs.next();
		return rs.getInt(1);

	}

	public void addBooking(Booking booking) throws SQLException {
		String query = "insert into booking values(?,?,?)";

		Connection con = DBconnection.getDBConnection();

		PreparedStatement pst = con.prepareStatement(query);
		java.sql.Date sqldate = new java.sql.Date(booking.date.getTime());
		pst.setString(1, booking.passengerName);
		pst.setInt(2, booking.busNo);
		pst.setDate(3, sqldate);
		pst.executeUpdate();
	}

}
