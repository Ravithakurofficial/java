
public class Practical18 {

  public static void main(String[] args) {
    Thread thread1 = new Thread(new DisplayMessage("GOOD MORNING", 1000));
    Thread thread2 = new Thread(new DisplayMessage("HELLO", 2000));
    Thread thread3 = new Thread(new DisplayMessage("WELCOME", 3000));
    thread1.start();
    thread2.start();
    thread3.start();
  }
}

class DisplayMessage implements Runnable {

  private String message;
  private int interval;

  public DisplayMessage(String message, int interval) {
    this.message = message;
    this.interval = interval;
  }

  public void run() {
    try {
      while (true) {
        System.out.println(message);
        Thread.sleep(interval);
      }
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}