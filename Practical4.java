//Design a java program to print all the real solutions of the quadratic equation ax2+bx+c=0, read in the values of a,b,c and use the quadratic equation formula. If the discriminant b2-4ac is negative, display a message stating that there are no real solutions. Description: The name of class is Quadratic, having data members a,b,c,r1,r2. Member functions of class are inputEquation(), findRoots() and displayRoots(). Make separate class to create void main.

import static java.lang.Math.*;

class Quadratic {
    double a, b, c, r1, r2, d;

    void input_equation(double a1, double b1, double c1) {
        a = a1;
        b = b1;
        c = c1;
    }

    void calculate_roots() {
        d = b * b - 4 * a * c;
        if (d > 0) {
            System.out.println("The roots of the equation are real and different. \n");
            r1 = -b + sqrt(abs(d)) / 2 * a;
            r2 = -b - sqrt(abs(d)) / 2 * a;
            System.out.println(" roots are : " + r1 + " " + r2);
        } else if (d == 0) {
            System.out.println("The roots of the equation are real and same. \n"); 
            r1 = -b / 2 * a;
            r2 = -b / 2 * a;
            System.out.println(" roots are : " + r1 + " " + r2);
        }
        else{
            System.out.println("The roots of the equation are complex and different. \n"); 
            r1 = -b / 2 * a;
            r2 = -b / 2 * a;
            System.out.println(r1 + " + i"+ d + "\n"+ r2+ " - i" + d); 
        }
    }
}

class Practical4{
    public static void main(String[] args) {
        Quadratic q = new Quadratic();
        q.input_equation(10.0,20.0,14.0);
        q.calculate_roots();
    }
}
