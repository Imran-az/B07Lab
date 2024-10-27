public class RectangleTests {
    @Test
    public void testPerimeter() {
        Point A = new Point(1, 1);
        Point B = new Point(5, 1);
        Point C = new Point(5, 3);
        Point D = new Point(1, 3);
        Rectangle rectangle = new Rectangle(A, B, C, D);

        assertEquals(12.0, rectangle.perimeter(), 0.0001);
    }

    @Test
    public void testComputeArea() {
        Point A = new Point(0, 0);
        Point B = new Point(6, 0);
        Point C = new Point(6, 2);
        Point D = new Point(0, 2);
        Rectangle rectangle = new Rectangle(A, B, C, D);

        assertEquals(12.0, rectangle.computeArea(), 0.0001);
    }

    @Test
    public void testDiagonalLength() {
        Point A = new Point(2, 2);
        Point B = new Point(8, 2);
        Point C = new Point(8, 5);
        Point D = new Point(2, 5);
        Rectangle rectangle = new Rectangle(A, B, C, D);

        assertEquals(6.7082, rectangle.diagonalLength(), 0.0001);
    }

    @Test
    public void testIsSquare() {
        Point A = new Point(3, 3);
        Point B = new Point(6, 3);
        Point C = new Point(6, 6);
        Point D = new Point(3, 6);
        Rectangle square = new Rectangle(A, B, C, D);

        assertTrue(square.isEquilateral());
    }

    @Test
    public void testIsNotSquare() {
        Point A = new Point(1, 1);
        Point B = new Point(5, 1);
        Point C = new Point(5, 4);
        Point D = new Point(1, 4);
        Rectangle rectangle = new Rectangle(A, B, C, D);

        assertFalse(rectangle.isEquilateral());
    }
}
