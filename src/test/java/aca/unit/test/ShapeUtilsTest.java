package aca.unit.test;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class ShapeUtilsTest {
	private static ShapeUtils shapeUtils;

	@BeforeClass
	public static void init() {
		shapeUtils = new ShapeUtils();
	}

	@Test
	public void testIsTriangleOK() {
		boolean result = shapeUtils.isTriangle(3.0, 4.0, 5.0);

		Assert.assertTrue(result);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testIsTriangleKO_WrongLength() {
		shapeUtils.isTriangle(0, 4.0, 5.0);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testIsTriangleKO_WrongLength2() {
		shapeUtils.isTriangle(1.0, -1, 5.0);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testIsTriangleKO_WrongLength3() {
		shapeUtils.isTriangle(3.0, 4.0, 0);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testIsTriangleKO_WrongLength4() {
		shapeUtils.isTriangle(-3.0, -4.0, -5.0);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testIsTriangleKO_WrongLength5() {
		shapeUtils.isTriangle(-3.0, -4.0, 5.0);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testIsTriangleKO_WrongLength6() {
		shapeUtils.isTriangle(3.0, -4.0, -5.0);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testIsTriangleKO_WrongLength7() {
		shapeUtils.isTriangle(-3.0, 4.0, -5.0);
	}
	
	@Test
	public void testIsTriangleKO() {
		boolean result = shapeUtils.isTriangle(2.0, 2.0, 5.0);

		Assert.assertFalse(result);
	}

	@Test
	public void testIsTriangleKO_2() {
		boolean result = shapeUtils.isTriangle(3.0, 6.0, 2.0);

		Assert.assertFalse(result);
	}

	@Test
	public void testIsTriangleKO_3() {
		boolean result = shapeUtils.isTriangle(5.0, 1.0, 2.0);

		Assert.assertFalse(result);
	}

}
