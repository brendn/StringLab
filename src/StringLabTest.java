import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringLabTest {

	@Test
	void testCaps() {
		String expected = "Foo";
		String result = StringLab.capitalize("foo"); //Foo
		
		assertEquals(expected, result);
	}
	
	@Test
	void testWaldo() {
		int expected = 8;
		int result = StringLab.wheresWaldo("Striped Waldo!");
		
		assertEquals(expected, result);
	}

	@Test
	void testReverse() {
		String expected = "yppah";
		String result = StringLab.reverse("happy"); //yppah
		
		assertEquals(expected, result);
	}
	
	@Test
	void testSoLong() {
		String expected = "bean";
		String result = StringLab.soLong("bean", "pea");
		
		assertEquals(expected, result);
	}

	@Test
	void testLetterize() {
		String expected = "J a v a";
		String result = StringLab.letterize("Java");
		
		assertEquals(expected, result);
	}
	
	@Test
	void testFirstThing() {
		String expected = "pine tree";
		String result = StringLab.firstThingsFirst("tree", "pine");
		
		assertEquals(expected, result);
	}
	
	@Test
	void testAfterMath() {
		String expected = "mathematics test!";
		String result = StringLab.afterMath("She aced the mathematics test!");
		
		assertEquals(expected, result);
	}
	
	@Test
	void testCamelCase() {
		String expected = "desertSurvivalSkills";
		String result = StringLab.camelCase("desert survival skills");
		
		assertEquals(expected, result);
	}
	
}
