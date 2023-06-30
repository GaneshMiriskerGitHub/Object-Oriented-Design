import java.util.Date;

public class Ticket {
	
	private static int idcounter;
	private int id;
	private String ownerName;
	private Date bookingTime; 
	private int seatNo;
	private Show showName;
	
	
	
	
	public Ticket(String ownerName, Date bookingTime, int seatNo, Show showName) {
		idcounter++;
		this.id = idcounter;
		this.ownerName = ownerName;
		this.bookingTime = bookingTime;
		this.seatNo = seatNo;
		this.showName = showName;
	}
	/*
	 * getters and setters
	 */
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public Date getBookingTime() {
		return bookingTime;
	}
	public void setBookingTime(Date bookingTime) {
		this.bookingTime = bookingTime;
	}
	public int getSeatNo() {
		return seatNo;
	}
	public void setSeatNo(int seatNo) {
		this.seatNo = seatNo;
	}
	public Show getShowName() {
		return showName;
	}
	public void setShowName(Show showName) {
		this.showName = showName;
	}
	
	
}
