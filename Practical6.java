//Design a java program to prompt user for an integer and print all the prime numbers up to that integer.

import java.util.*;

class Prime {
    int value, num;
    int i, flag;

    void inputNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A NUMBER ");
        value = sc.nextInt();
    }

    void displayPrime() {
        for (num = 2; num <= value; num++) {
            flag = 0;
            for (i = 2; i <= num - 1; i++) {
                if (num % i == 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(num);
            }
        }
    }
}

class Practical6 {
    public static void main(String a[]) {
        Prime o = new Prime();
        o.inputNumber();
        o.displayPrime();
    }
}
