import java.util.Date;

public class Show {
	
	private static int idcounter;
	private int id;
	private Date show_di_date_time;
	private int availableSeats;
	
	private Movie movie;
	private Theater theater;
	
	
	
	
	public Show(Date show_di_date_time, int availableSeats, Movie movie, Theater theater) {
		idcounter++;
		this.id = idcounter;
		this.show_di_date_time = show_di_date_time;
		this.availableSeats = theater.getCapacity();
		this.movie = movie;
		this.theater = theater;
	}
	
	
	public void updateShow() {
		
	}
	
	public  Ticket bookTicket(RegisteredUser user, int noOfSeats) {
		if(availableSeats >= noOfSeats) {
			availableSeats -= noOfSeats;
			Ticket tickets = new Ticket(user.getName(), new Date(),noOfSeats, this);
			System.out.println("yeyyii tickets book ayi peekineyi thee party,,,");
			return tickets;
		}else {
			System.out.println("ayyo... saripada tickets levuu shit, sare le, intiki dobbeyi");
			return null;
		}
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
	public Date getShow_di_date_time() {
		return show_di_date_time;
	}
	public void setShow_di_date_time(Date show_di_date_time) {
		this.show_di_date_time = show_di_date_time;
	}
	public int getAvailableSeats() {
		return availableSeats;
	}
	public void setAvailableSeats(int availableSeats) {
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
	
	

}
