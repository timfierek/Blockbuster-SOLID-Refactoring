import java.util.ArrayList;

/**
 * Movie is an abstract class to model certain movie rentals based on
 * in children classes.
 * 
 * @author Tim Fierek
 *
 */
public class Movie {
	private String title;
	private int runTime;
	private ArrayList<String> scenes;
	private Play movieType;
	
	public Movie(String title, int runTime, ArrayList<String> scenes, Play movieType) {
		this.title = title;
		this.runTime = runTime;
		this.scenes = scenes; 
		this.movieType = movieType;
	}
	
	/**
	 * Basic instance output method that prints title and runTime
	 */
	public void printInfo() {
		System.out.println("Title: " + title + " Runtime: " + runTime + "min(s)");
	}
	
	/**
	 * Prints each scene along with index from scenes ArrayList
	 */
	public void printScenes() {
		for(int i = 0; i < scenes.size(); i++) {
			System.out.println("Scene: " + i + ": " + scenes.get(i));
		}
	}
	
	public void play() {
		movieType.play(scenes);
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setRunTime(int runTime) {
		this.runTime = runTime;
	}
	
	public void setScenes(ArrayList<String> scenes) {
		this.scenes = scenes;
	}
	
	public String getTitle() {
		return title;
	}
	
	public int getRunTime() {
		return runTime;
	}
	
	public ArrayList<String> getScenes(){
		return scenes;
	}

}