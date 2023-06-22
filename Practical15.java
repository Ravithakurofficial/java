//Design a java program to create two threads: one for odd numbers and other for even numbers.

class EvenThread extends Thread {

  int num;

  void set() {
    this.num = 0;
  }

  public void run() {
    for (int i = 1; i <= 10; i++) {
      try {
        even();
        Thread.sleep(500);
      } catch (InterruptedException e) {
        System.out.println("INTERRUPTED EXCEPTION ");
      }
    }
  }

  void even() {
    num = num + 2;
    System.out.println("Even : " + num);
  }
}

class OddThread implements Runnable {

  int num;

  void set() {
    this.num = 1;
  }

  public void run() {
    for (int i = 1; i <= 10; i++) {
      try {
        odd();
        Thread.sleep(500);
      } catch (InterruptedException e) {
        System.out.println("INTERRUPTED EXCEPTION ");
      }
    }
  }

  void odd() {
    num = num + 2;
    System.out.println("Odd : " + num);
  }
}

class Practical15 {

  public static void main(String a[]) {
    int i;
    EvenThread et = new EvenThread();
    OddThread ot = new OddThread();
    Thread t = new Thread(ot);
    et.set();
    ot.set();
    et.start();
    t.start();
  }
}