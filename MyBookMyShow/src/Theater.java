import java.util.ArrayList;

public class Theater {
	
	private static int idcounter;
	private int id;
	private String name;
	private int capacity;
	private String location;
	
	private ArrayList<Show> shows;
	
	public Theater(String name, int capacity, String location, ArrayList<Show> shows) {
		idcounter++;
		this.id = idcounter;
		this.name = name;
		this.capacity = capacity;
		this.location = location;
		this.shows = new ArrayList<>();
	}
	
	
	public void updateShow(Show oldShow, Show newShow) {
		
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public ArrayList<Show> getShows() {
		return shows;
	}

	public void setShows(ArrayList<Show> shows) {
		this.shows = shows;
	}
	
	

}
