package BusReserve;

public class Bus {
	private int busNo;
	private boolean ac;
	private int capacity;// getters & setters

	Bus(int no, boolean ac, int cap) {
		busNo = no;
		this.ac = ac;
		capacity = cap;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int cap) {
		this.capacity = cap;
	}

	public boolean getAC() {
		return ac;
	}

	public void setAC(boolean ac) {
		this.ac = ac;
	}

	public int getBusNo() {
		return busNo;
	}

	public void getBusInfo() {
		System.out.println("BusNo is " + busNo + " is AC " + ac + " capacity is " + capacity);
	}

}
