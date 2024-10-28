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
    //test1: testing perimeter
    @Test
    void test1() {
        Point A = new Point(0, 0);
        Point B = new Point(4, 0);
        Point C = new Point(4, 3);
        Point D = new Point(0, 3);
        Rectangle rectangle = new Rectangle(A, B, C, D);

        double expectedPerimeter = 14.0;
        assertEquals(expectedPerimeter, rectangle.perimeter(), 0.001);
    }
    //test2 testing area 
    @Test
    void test2() {
        Point A = new Point(0, 0);
        Point B = new Point(4, 0);
        Point C = new Point(4, 3);
        Point D = new Point(0, 3);
        Rectangle rectangle = new Rectangle(A, B, C, D);

        double expectedArea = 12.0;
        assertEquals(expectedArea, rectangle.computeArea(), 0.001);
    }
    //test3 diagonal length
    @Test
    void test3() {
        Point A = new Point(0, 0);
        Point B = new Point(4, 0);
        Point C = new Point(4, 3);
        Point D = new Point(0, 3);
        Rectangle rectangle = new Rectangle(A, B, C, D);

        double expectedDiagonalLength = 5.0;
        assertEquals(expectedDiagonalLength, rectangle.diagonalLength(), 0.001);
    }
    //test4 test case when rectangle is square 
    @Test
    void test5() {
        Point A = new Point(0, 0);
        Point B = new Point(2, 0);
        Point C = new Point(2, 2);
        Point D = new Point(0, 2);
        Rectangle square = new Rectangle(A, B, C, D);

        assertTrue(square.isSquare());
    }
    //test5 test case if rectangle is not a square 
    @Test
    void testIsSquare_False() {
        Point A = new Point(0, 0);
        Point B = new Point(4, 0);
        Point C = new Point(4, 3);
        Point D = new Point(0, 3);
        Rectangle rectangle = new Rectangle(A, B, C, D);

        assertFalse(rectangle.isSquare());
    }
}
