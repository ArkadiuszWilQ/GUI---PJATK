package zadanie1;


public class Main {

  public static void main(String[] args) throws InterruptedException {
    Letters letters = new Letters("ABCD");
    for (Thread t : letters.getThreads()) System.out.println(t.getName());
    
    (letters.getThreads()).forEach((thread) -> thread.start());

    Thread.sleep(5000);


    for (Thread thread : letters.getThreads()){
        thread.interrupt();
    }
    System.out.println("\nProgram skończył działanie");
  }

}
