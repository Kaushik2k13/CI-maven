package in.setup;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class checkTest {
	
	private static check area ;
	@BeforeClass
	public static void setup() {
		area = new check();
	}
	@Test
	public void testSq_area() {
		assertEquals(16,area.sq_area(4));
	}
	@Test
	public void testC_area() {
		assertEquals(78.5,area.c_area(5),0);
	}
	@Test
	public void testRec_area() {
		assertEquals(12,area.rec_area(3,4));
	}
	@Test
	public void testtri_area() {
		assertEquals(7.875,area.tri_area(3.5,4.5),0);
	}}