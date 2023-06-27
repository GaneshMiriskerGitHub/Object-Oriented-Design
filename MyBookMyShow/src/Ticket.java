import java.util.Date;

public class Ticket {
	
	private static int idCounter=0;
	private Integer id;
	private String ownerName;
	private Date bookingTime;
	private Integer numberOfSeats;
	
	private Show bookedShow;

	public Show getBookedShow() {
		return bookedShow;
	}

	public void setBookedShow(Show bookedShow) {
		this.bookedShow = bookedShow;
	}

	public Ticket() {
        idCounter += 1;
        this.id = idCounter;
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	public Integer getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(Integer numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}


	
	

}
