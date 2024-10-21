import lab5.Point;
import lab5.Triangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointAndTriangleTests {

    @Test
    void testDistanceSelf() {
        Point p = new Point(3,4);
        assertEquals(0, p.distance(p));
    }

    @Test
    void testDistance() {
        Point p1 = new Point(3,4);
        Point p2 = new Point(0,0);
        assertEquals(5, p1.distance(p2));
    }

    @Test
    void testDistanceSymmetric() {
        Point p1 = new Point(3,4);
        Point p2 = new Point(0,0);
        assertEquals(p1.distance(p2), p2.distance(p1));
    }

    @Test
    void testHashCode() {
        Point p = new Point(3,4);
        assertEquals(3*3 + 5*4, p.hashCode());
    }

    @Test
    void testEqualsSameInstance() {
        Point p = new Point(3,4);
        assertEquals(p, p);
    }

    @Test
    void testEqualsNull() {
        Point p = new Point(3,4);
        assertFalse(p.equals(null));
    }

    @Test
    void testEqualsDifferentClass() {
        Point p = new Point(3,4);
        assertFalse(p.equals("foo"));
    }

    @Test
    void testDifferingYCoordinate() {
        Point p1 = new Point(3,4);
        Point p2 = new Point(3,5);
        assertFalse(p1.equals(p2));
    }

    @Test
    void testDifferingXCoordinate() {
        Point p1 = new Point(3,4);
        Point p2 = new Point(4,4);
        assertFalse(p1.equals(p2));
    }

    @Test
    void testEqualsSameCoordinates() {
        Point p1 = new Point(3,4);
        Point p2 = new Point(3,4);
        assertEquals(p1, p2);
    }


    @Test
    void testTrianglePerimeter() {
        Point p1 = new Point(0,0);
        Point p2 = new Point(0,3);
        Point p3 = new Point(4,0);
        Triangle t = new Triangle(p1, p2, p3);
        assertEquals(12, t.perimeter());
    }

    @Test
    void testEquilateralTriangleCheck() {
        Point p1 = new Point(0,0);
        Point p2 = new Point(0,3);
        Point p3 = new Point(4,0);
        Triangle t = new Triangle(p1, p2, p3);
        assertFalse(t.isEquilateral());
    }


    @Test
    void testEquilateralTriangleCheck2() {
        Point p = new Point(0,0);
        Triangle t = new Triangle(p, p, p);
        assertTrue(t.isEquilateral());
    }

    @Test
    void testEquilateralTriangleFirstTwoPoints() {
        Point p = new Point(0,0);
        Triangle t = new Triangle(p, new Point(1,1), p);
        assertFalse(t.isEquilateral());
    }

}
