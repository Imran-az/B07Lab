public class RectangleTests {
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
    //test4 test for diagonal length 
    @Test
    void test4() {
        Point A = new Point(0, 0);
        Point B = new Point(4, 0);
        Point C = new Point(4, 3);
        Point D = new Point(0, 3);
        Rectangle rectangle = new Rectangle(A, B, C, D);

        double expectedDiagonalLength = 5.0;
        assertEquals(expectedDiagonalLength, rectangle.diagonalLength(), 0.001);
    }
    //test5 test case when rectangle is square 
    @Test
    void test5() {
        Point A = new Point(0, 0);
        Point B = new Point(2, 0);
        Point C = new Point(2, 2);
        Point D = new Point(0, 2);
        Rectangle square = new Rectangle(A, B, C, D);

        assertTrue(square.isSquare());
    }
    //test6 test case if rectangle is not a square 
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
