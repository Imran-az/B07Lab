public class Rectangle { 
    Point A; //Top left point of rectangle
    Point B; //Top right point of rectangle
    Point C; //Bottom right point of rectangle 
    Point D; //Bottom left point of rectangle 

    public Rectangle(Point A, Point B, Point C, Point D){
        this.A  = A;
        this.B = B;
        this.C  =C;
        this.D = D;
    }

    public double perimeter(){
        return A.distance(B) + B.distance(C) + C.distance(D) + D.distance(A);
    }

    public double computeArea(){
        return A.distance(B) * B.distance(C);
    }

    public double diagonalLength() {
        return A.distance(C);   
    }



    public boolean isEquilateral(){
        double dAB = A.distance(B);
        double dBC = B.distance(C);
        double dCD = C.distance(D);
        double dDA = D.distance(A);

        if(dAB == dBC & dBC == dCD & dCD == dDA){
            return true;
        }
        else{
            return false;
        }

    }

}
