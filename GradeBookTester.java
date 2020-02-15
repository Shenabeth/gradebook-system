import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTester {
	
	GradeBook grades1;
	GradeBook grades2;
	
	@BeforeEach
	void setUp() throws Exception {
		grades1 = new GradeBook(5);
		grades1.addScore(5);
		grades1.addScore(13);
		grades1.addScore(70);
		grades1.addScore(61);
		grades1.addScore(1);
		
		grades2 = new GradeBook(3);
		grades2.addScore(29);
		grades2.addScore(3);
		grades2.addScore(17);
	}

	@AfterEach
	void tearDown() throws Exception {
		grades1 = null;
		grades2 = null;
	}

	@Test
	void testAddScore() {
		assertTrue(grades1.toString().equals("5.0 13.0 70.0 61.0 1.0 "));
		assertTrue(grades2.toString().equals("29.0 3.0 17.0 "));
	}

	@Test
	void testSum() {
		assertEquals(150, grades1.sum(), .0001);
		assertEquals(49, grades2.sum(), .0001);
	}

	@Test
	void testMinimum() {
		assertEquals(1, grades1.minimum(), .001);
		assertEquals(3, grades2.minimum(), .001);
	}

	@Test
	void testFinalScore() {
		assertEquals(149, grades1.finalScore(), .001);
		assertEquals(46, grades2.finalScore(), .001);
	}

	@Test
	void testGetScoreSize() {
		assertEquals(5, grades1.getScoreSize(), .001);
		assertEquals(3, grades2.getScoreSize(), .001);
	}

	@Test
	void testToString() {
		assertTrue(grades1.toString().equals("5.0 13.0 70.0 61.0 1.0 "));
		assertTrue(grades2.toString().equals("29.0 3.0 17.0 "));
	}
}
