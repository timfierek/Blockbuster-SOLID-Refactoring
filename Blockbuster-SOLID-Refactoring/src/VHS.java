import java.util.List;

/**
 * VHS is a child class of Movie and incorporates new methods along with the provided
 * ones from Movie.
 * 
 * @author Tim Fierek
 *
 */
public class VHS implements Play{

	private int currentTime;
	private String title;
	
	public VHS(String title) {
		this.title = title;
		currentTime = 0;
	}
	
	@Override
	public void play(List<String> scenes) {
		if(currentTime > scenes.size()-1) {
			rewind();
		}
		System.out.println("VHS " + title);
		System.out.println("Scene " + currentTime + ": " + scenes.get(currentTime));
		currentTime++;
		
	}
	
	public void rewind() {
		currentTime = 0;
	}
	
	public int getCurrentTime() {
		return currentTime;
	}
	
	public void setCurrentTime(int currentTime) {
		this.currentTime = currentTime;
	}
}