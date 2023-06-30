
public class Movie {
	
	private String name;
	private float ratings = 0.0f;
	
	private Language language;
	private Genre genre;
	
	
	public Movie(String name, float ratings, Language language, Genre genre) {
		this.name = name;
		this.ratings = ratings;
		this.language = language;
		this.genre = genre;
	}
	/*
	 * getters and setters
	 */
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getRatings() {
		return ratings;
	}
	public void setRatings(float ratings) {
		this.ratings = ratings;
	}
	public Language getLanguage() {
		return language;
	}
	public void setLanguage(Language language) {
		this.language = language;
	}
	public Genre getGenre() {
		return genre;
	}
	public void setGenre(Genre genre) {
		this.genre = genre;
	}
	
	
}
