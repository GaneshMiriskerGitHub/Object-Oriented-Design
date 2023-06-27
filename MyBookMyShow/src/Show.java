import java.util.Date;

public class Show {

	private static int idCounter = 0;
	private Integer id;
	private Date showTime;
	private Integer availableSeats;

	private Movie movie;
	private Theater theater;

	public Show(Integer id, Date showTime, Integer availableSeats, Movie movie, Theater theater) {
		idCounter += 1;
		this.id = idCounter;
		this.showTime = showTime;
		this.availableSeats = availableSeats;
		this.movie = movie;
		this.theater = theater;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getShowTime() {
		return showTime;
	}

	public void setShowTime(Date showTime) {
		this.showTime = showTime;
	}

	public Integer getAvailableSeats() {
		return availableSeats;
	}

	public void setAvailableSeats(Integer availableSeats) {
		this.availableSeats = availableSeats;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public Theater getTheater() {
		return theater;
	}

	public void setTheater(Theater theater) {
		this.theater = theater;
	}

	public void updateShow() {
	}

	public synchronized Ticket bookTicket(RegisteredUser user, int seats) {
		if (availableSeats >= seats && seats > 0) {
			Ticket ticket = new Ticket();
			availableSeats -= seats;
			ticket.setOwner(user.getName());
			ticket.setBookedShow(this);
			ticket.setBookingTime(new Date());
			ticket.setNumberOfSeats(seats);
			System.out.println("Successfully booked");
			user.bookingHistory.add(ticket);
			return ticket;
		} else {
			System.out.println("Seats not Available");
			return null;
		}
	}
	
	@Override
    public String toString() {
        return "Show{" +
                "id=" + id +
                ", showTime=" + showTime +
                ", movie=" + movie.getName() +
                ", theater=" + theater.getName() +
                ", availableSeats=" + availableSeats +
                '}';
    }

}
