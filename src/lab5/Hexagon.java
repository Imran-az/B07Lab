package lab5;

public class Hexagon {
    Point A;
    Point B;
    Point C;
    Point D;
    Point E;
    Point F;
    
    public Hexagon(Point A, Point B, Point C, Point D, Point E, Point F) {
        this.A = A;
        this.B = B;
        this.C = C;
        this.D = D;
        this.E = E;
        this.F = F;
    }
    
    public double perimeter() {
        return A.distance(B) + B.distance(C) + C.distance(D) + D.distance(E) + E.distance(F) + F.distance(A);
    }

   
    public boolean isNormalHexagon() {

		double sideLength = A.distance(B);
        double t = 0.01;
        return Math.abs(sideLength - B.distance(C)) < t &&
           Math.abs(sideLength - C.distance(D)) < t &&
           Math.abs(sideLength - D.distance(E)) < t &&
           Math.abs(sideLength - E.distance(F)) < t &&
           Math.abs(sideLength - F.distance(A)) < t;
    }
    
    
    public double area() throws IllegalArgumentException{
        if (!isNormalHexagon()) {
            throw new IllegalArgumentException("Points do not form a normal hexagon, the area function only works for normal hexagons.");
        }
        
        
        double sideLength = A.distance(B);
        return (3 * Math.sqrt(3) / 2) * sideLength * sideLength;
    }
}
