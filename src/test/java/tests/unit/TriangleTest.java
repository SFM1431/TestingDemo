package tests.unit;
// TriangleTest.java

import org.junit.Test;
import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void testEquilateralTriangle() {
        Triangle triangle = new Triangle(3.0, 3.0, 3.0);
        String type = triangle.showType();
        assertEquals("Equilateral", type);
    }

    @Test
    public void testIsoscelesTriangle() {
        Triangle triangle = new Triangle(5.0, 5.0, 7.0);
        String type = triangle.showType();
        assertEquals("Isosceles", type);
    }

    @Test
    public void testScaleneTriangle() {
        Triangle triangle = new Triangle(6.0, 8.0, 10.0);
        String type = triangle.showType();
        assertEquals("Scalene", type);
    }

    @Test
    public void testInvalidTriangle() {
        Triangle triangle = new Triangle(1.0, 2.0, 5.0);
        String type = triangle.showType();
        assertEquals("Scalene", type); // An invalid triangle is treated as Scalene
    }
}
