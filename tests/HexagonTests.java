import lab5.Hexagon;
import lab5.Point;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class HexagonTests {

    @Test
    public void testArea() {
        Point A = new Point(0, 0);
        Hexagon hexagon = new Hexagon(A, A, A, A, A, A);

        double expectedArea = 0;
        assertEquals(expectedArea, hexagon.area(), 0.0001);
    }

    @Test
    public void testPerimeter() {
        Point A = new Point(0, 0);
        Point B = new Point(1, 0);
        Point C = new Point(1.5, Math.sqrt(3) / 2);
        Point D = new Point(1, Math.sqrt(3));
        Point E = new Point(0, Math.sqrt(3));
        Point F = new Point(-0.5, Math.sqrt(3) / 2);
        Hexagon hexagon = new Hexagon(A, B, C, D, E, F);

        double expectedPerimeter = 6.0;
        assertEquals(expectedPerimeter, hexagon.perimeter(), 0.0001);
    }


    @Test
    public void testAreaException() {
        Point A = new Point(0, 0);
        Point B = new Point(2, 0);
        Point C = new Point(1.5, Math.sqrt(3) / 2);
        Point D = new Point(1, Math.sqrt(3));
        Point E = new Point(0, Math.sqrt(3));
        Point F = new Point(-0.5, Math.sqrt(3) / 2);
        Hexagon hexagon = new Hexagon(A, B, C, D, E, F);

        assertThrows(IllegalArgumentException.class, hexagon::area);
    }
}
