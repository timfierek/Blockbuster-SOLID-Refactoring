import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class VHSTest {

	@Test
	void testConstructor1() {
		ArrayList<String> scenes = new ArrayList<>();
		Movie test1 = new Movie("test", 4, scenes, new VHS("test"));
		assertEquals("test movie", test1.getTitle());
	}
	
	@Test
	void testConstructor2() {
		ArrayList<String> scenes = new ArrayList<>();
		Movie test2 = new Movie("test", 4, scenes, new VHS("test"));
		assertEquals(4, test2.getRunTime());
	}
	
	@Test
	void testConstructor3() {
		ArrayList<String> scenes = new ArrayList<>();
		Movie test3 = new Movie("test", 4, scenes, new VHS("test"));
		assertNotNull(test3.getScenes());
	}
	
	@Test
	void testConstructor4() {
		VHS testVHS = new VHS("test");
		assertEquals(0, testVHS.getCurrentTime());
	}
	
	@Test
	void testPlay() {
		ArrayList<String> scenes = new ArrayList<>();
		scenes.add("scene 1");
		scenes.add("scene 2");
		scenes.add("scene 3");
		scenes.add("scene 4");
		VHS testVHS = new VHS("test");
		Movie test5 = new Movie("test", 4, scenes, testVHS);
		test5.play();
		assertEquals(1, testVHS.getCurrentTime());
	}
	
	@Test
	void testRewind() {
		ArrayList<String> scenes = new ArrayList<>();
		scenes.add("scene 1");
		scenes.add("scene 2");
		scenes.add("scene 3");
		scenes.add("scene 4");
		VHS testVHS = new VHS("test");
		Movie test6 = new Movie("test", 4, scenes, new VHS("test"));
		test6.play();
		test6.play();
		testVHS.rewind();
		assertEquals(0, testVHS.getCurrentTime());
	}
	
	@Test
	void testAutoRewind() {
		ArrayList<String> scenes = new ArrayList<>();
		scenes.add("scene 1");
		scenes.add("scene 2");
		scenes.add("scene 3");
		scenes.add("scene 4");
		VHS testVHS = new VHS("test");
		Movie test7 = new Movie("test", 4, scenes, new VHS("test"));
		test7.play();
		test7.play();
		test7.play();
		test7.play();
		assertEquals(0, testVHS.getCurrentTime());
	}
	
	

}