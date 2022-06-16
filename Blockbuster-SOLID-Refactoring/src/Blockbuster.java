import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Blockbuster contains the io functionality and main method of the app.
 * 
 * @author Tim Fierek
 *
 */
public class Blockbuster {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		ArrayList<Movie> movies = new ArrayList<>();

		ArrayList<String> babyDriverScenes = new ArrayList<String>(Arrays.asList("Baby is born", "Baby learns to drive",
				"Baby gets car", "Baby arrested", "Baby goes to prison"));
		Play babyDriverDVD = new DVD("Baby Driver");
		movies.add(new Movie("Baby Driver", 120, babyDriverScenes, babyDriverDVD));

		ArrayList<String> starWarsScenes = new ArrayList<String>(
				Arrays.asList("Lightsaber goes brrr", "Yoda's adventure", "Darth Vader is born", "Wookie"));
		Play starWarsDVD = new DVD("Star Wars");
		movies.add(new Movie("Star Wars", 97, starWarsScenes, starWarsDVD));

		ArrayList<String> upScenes = new ArrayList<String>(
				Arrays.asList("His wife dies", "balloon inflation", "Russ meets old man"));
		Play upDVD = new DVD("Up");
		movies.add(new Movie("Up", 145, upScenes, upDVD));

		ArrayList<String> fastAndFuriousScenes = new ArrayList<String>(
				Arrays.asList("Bad guys shows up", "Big fight scene", "Aggressive driving", "More fighting"));
		Play fastAndFuriousVHS = new VHS("Fast and Furious");
		movies.add(new Movie("Fast and Furious 12", 240, fastAndFuriousScenes, fastAndFuriousVHS));

		ArrayList<String> shrekScenes = new ArrayList<String>(
				Arrays.asList("Shrek shows up", "Swamp dries out", "Shrek's wedding", "Epic quest"));
		Play shrekVHS = new VHS("Shrek");
		movies.add(new Movie("Shrek 5", 62, shrekScenes, shrekVHS));

		ArrayList<String> spaceJamScenes = new ArrayList<String>(Arrays.asList("Dribbling", "Aliens visit",
				"More dribbling", "Exploring pluto", "Dribbling againg", "Porky dunks"));
		Play spaceJamVHS = new VHS("Space Jam");
		movies.add(new Movie("Space Jam 3", 36, spaceJamScenes, spaceJamVHS));

		// Retrieve movie selection from user
		System.out.println("Welcome to GC Blockbuster!");
		int movieSelection = -1;
		printList(movies);
		
		while (movieSelection == -1) {
			try {
				movieSelection = scnr.nextInt();
			} catch (Exception e) {
				scnr.next();
				System.out.print("Invalid input, please enter a single integer: ");
			}
		}
		// Adjust movie selection for indices starting at 0
		movieSelection -= 1;
		
		// Print movie info, ask if user would like to play movie
		System.out.println("\n" + movies.get(movieSelection).getTitle());
		System.out.println("Runtime: " + movies.get(movieSelection).getRunTime() + " minutes");
		System.out.print("\nDo you want to watch the movie? Y/N: ");
		
		// If user decides to watch movie, prompt for which scene to watch
		boolean watch = getYesNo(scnr);
		while(watch) {		
			movies.get(movieSelection).play();
			System.out.print("\nWatch another scene? (y/n): ");
			watch = getYesNo(scnr);
		}
		
		
		System.out.println("\n\nBye!");
		scnr.close();
	}
	
	private static boolean getYesNo(Scanner scnr) {
		String answer = "";
		while(!answer.equals("y") && !answer.equals("n")) {
			try {
				answer = scnr.nextLine().toLowerCase();
			} catch(Exception e) {
				System.out.print("Invalid input, please enter 'y' or 'n': ");
			}
		}
		
		if(answer.equals("y")) {
			return true;
		}
		else {
			return false;
		}
	}

	private static void printList(ArrayList<Movie> movies) {
		System.out.println("Please Select a Movie from the list:");
		for (int i = 0; i < movies.size(); i++) {
			System.out.println("   " + (i + 1) + ") " + movies.get(i).getTitle());
		}
		System.out.print("Please select a movie you want to watch: ");
	}

}