//Design a java program to find the biggest of three given integers. The name of class is Largest, having data members num1, num2, num3, res. Member functions of class are inputData(), findLargest() and displayLargest(). Make separate class to create void main.

class Largest {
    int num1, num2, num3, result;

    void input() {
        num1 = 81;
        num2 = 92;
        num3 = 12;
    }

    void largest() {
        if (num1 > num2 && num1 > num3) {
            System.out.println("Largest : " + result);
            result = num1;
        } else if (num2 > num1 && num2 > num3) {
            result = num2;
            System.out.println("Largest : " + result);
        } else {
            result = num3;
            System.out.println("Largest : " + result);
        }
    }
}

class Practical1 {
    public static void main(String[] args) {
        Largest l = new Largest();
        l.input();
        l.largest();
    }
}
