package in.setup;

import static org.junit.Assert.*;

import org.junit.Test;

public class integrationtTest {
	private integrationt areas = new integrationt();
	@Test
	public void testSq_area() {
		assertEquals(144,areas.sq_area(areas.c_area(2)));
	}

	@Test
	public void testC_area() {
		assertEquals(48,areas.c_area(areas.sq_area(2)));

	}

	@Test
	public void testRec_area() {
		assertEquals(144,areas.rec_area(areas.sq_area(3),areas.sq_area(4)));

	}
	@Test
	public void testTri_area() {
		assertEquals(111,areas.tri_area(areas.c_area(5),areas.c_area(1)));
	}
}
