//Design a java program to create an abstract class named Shape, that contains an empty method called numberOfSides(). Provide four classes named Trapezoid, Triangle, Rectangle and Hexagon such that each one of the classes contains only the method numberOfSides(), that contains number of sides in each geometrical figure.

abstract class MyArea {
    abstract void area();
}

class SQArea extends MyArea {
    double s;

    void area() {
        double areasq;
        s = 11.0;
        areasq = s * s;
        System.out.println("Area of Square " + areasq);
    }
}

class RECTArea extends MyArea {
    double l, b;

    void area() {
        double arearect;
        l = 9.0;
        b = 3.0;
        arearect = l * b;
        System.out.println("Area of Rectangle " + arearect);
    }
}

class Practical10 {
    public static void main(String a[]) {
        // MyArea ma= new MyArea();
        // ma.area();
        MyArea sa = new SQArea();
        sa.area();
        MyArea ra = new RECTArea();
        ra.area();
    }
}
