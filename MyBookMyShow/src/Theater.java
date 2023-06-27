import java.util.ArrayList;

public class Theater {
	
	private static Integer idCounter = 0;
	private Integer id;
	private String name;
	private String location;
	private Integer capacity;
	
	private ArrayList<Show> shows;

	public Theater(Integer id, String name, String location, Integer capacity, ArrayList<Show> shows) {
		this.idCounter++;
		this.id = idCounter;
		this.name = name;
		this.location = location;
		this.capacity = capacity;
		this.shows = shows;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Integer getCapacity() {
		return capacity;
	}

	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}

	public ArrayList<Show> getShows() {
		return shows;
	}

	public void setShows(ArrayList<Show> shows) {
		this.shows = shows;
	}
	
	

	public void updateShow(Show oldShow, Show newShow) {
		
	}
	
}
