/**
 * PrintNumbers
 */
public class PrintNumbers implements Runnable{
  public void printNumbeers(){
    for(int i = 0; i < 9; i++){
      System.out.println(Thread.currentThread().getId() + ": " + i);
    }

    @Override
    public void run(){
      printNumbeers();
    }
  }
}

public class TestDriver {
  public static void main(String[] args) {
    System.out.println("Main ThreadId: " + Thread.currentThread().getId());

    for(int i = 0; i < 3; i++){
      new Thread(new PrintNumbers()).start();
    }
  }
}
