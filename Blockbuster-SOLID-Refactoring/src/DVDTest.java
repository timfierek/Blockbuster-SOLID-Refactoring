import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class DVDTest {

	@Test
	void testConstructor1() {
		ArrayList<String> scenes = new ArrayList<>();
		Play testDVD = new DVD("test movie");
		Movie test1 = new Movie("test movie", 4, scenes, testDVD);
		assertEquals("test movie", test1.getTitle());
	}
	
	@Test
	void testConstructor2() {
		ArrayList<String> scenes = new ArrayList<>();
		Play testDVD2 = new DVD("test movie 2");
		Movie test2 = new Movie("test movie", 4, scenes, testDVD2);
		assertEquals(4, test2.getRunTime());
	}

}