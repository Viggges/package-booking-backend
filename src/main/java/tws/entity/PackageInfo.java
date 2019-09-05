package tws.entity;

public class PackageInfo {

	String trackNum;
	String addressee;
	String phoneNum;
	double weight;
	String status;
	String bookings;

	public String getTrackNum() {
		return trackNum;
	}

	public PackageInfo() {

	}

	public PackageInfo(String trackNum, String addressee, String phoneNum, double weight, String status,
			String bookings) {
		super();
		this.trackNum = trackNum;
		this.addressee = addressee;
		this.phoneNum = phoneNum;
		this.weight = weight;
		this.status = status;
		this.bookings = bookings;
	}

	public void setTrackNum(String trackNum) {
		this.trackNum = trackNum;
	}

	public String getAddressee() {
		return addressee;
	}

	public void setAddressee(String addressee) {
		this.addressee = addressee;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getStatus() {
		return status;
	}

	public void setStatu(String status) {
		this.status = status;
	}

	public String getBookings() {
		return bookings;
	}

	public void setBookings(String bookings) {
		this.bookings = bookings;
	}
}
