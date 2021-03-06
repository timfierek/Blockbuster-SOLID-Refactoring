import java.util.List;
import java.util.Scanner;

/**
 * DVD provides extended functionality from its Movie super class.
 * 
 * @author Tim Fierek
 *
 */
public class DVD implements Play{

	private static Scanner scnr;
	private String title;
	
	public DVD(String title) {
		this.title = title;
		scnr = new Scanner(System.in);
	}
	
	@Override
	public void play(List<String> scenes) {
		
		int scene = -1;
		
		do {
			System.out.println("\nWhich scene of the DVD " + title);
			System.out.print("Would you like to watch? Select 0 to " + (scenes.size() - 1) + ": ");
			try {
				scene = scnr.nextInt();
			}catch(Exception e) {
				scnr.next(); 
				System.out.println("Invalid input recieved, try again:");
			}
			
			
		}while(scene == -1);
		
		System.out.println("\nScene " + scene + ": " + scenes.get(scene));
	}
	
}