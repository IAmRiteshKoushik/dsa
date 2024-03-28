/**
 * ThreadTester
 */
public class Thread1 extends Thread {

  public Thread1(String threadName){
    super(threadName);
    super.run();
  }

  @Override
  public void run(){
    for(int i = 0; i < 5; i++){
      System.out.println("Inside " + Thread.currentThread().getName() + " " + i);
    }
  }
}
