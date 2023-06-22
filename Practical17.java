class Callme {

  void call(String msg, int t) {
    System.out.println(msg);
    try {
      Thread.sleep(t * 1000);
    } catch (InterruptedException e) {
      System.out.println("Interrupted");
    }
  }
}

class Caller implements Runnable {

  String msg;
  int time;
  Callme target;
  Thread t;

  public Caller(Callme targ, String s, int et) {
    target = targ;
    msg = s;
    time = et;
    t = new Thread(this);
    t.start();
  }

  public void run() {
    int i;
    for (i = 1; i <= 5; i++) {
      synchronized (target) {
        target.call(msg, time);
      }
    }
  }
}

class Practical17 {

  public static void main(String args[]) {
    Callme target = new Callme();
    Caller ob1 = new Caller(target, "GOOD MORNING", 1);
    Caller ob2 = new Caller(target, "HELLO", 2);
    Caller ob3 = new Caller(target, "WELCOME", 3);
    try {
      ob1.t.join();
      ob2.t.join();
      ob3.t.join();
    } catch (InterruptedException e) {
      System.out.println("Interrupted");
    }
  }
}
