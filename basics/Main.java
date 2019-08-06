import java.lang.Math;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main{
  public static void main(String[] args) {
    
    // Test pluralize
    int dogCount = 1;
    System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

    int catCount = 2;
    System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

    int turtleCount = 0;
    System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

    System.out.println();  

    // Test coin flip
    flipNHeads(1);
    flipNHeads(2);

    // Start clock
    System.out.println("Stop clock with control+C");
    clock();

  }

  public static String pluralize(String s, int c) {
    if(c == 0 || c > 1)
      s += "s";
    return s;
  }

  public static void flipNHeads(int n) {
    int headsCount = 0;
    int flipCount = 0;
    while(headsCount < n){
      if(Math.random() >= .5){
        System.out.println("Heads.");
        headsCount++;
      }
      else{
        System.out.println("Tails.");
        headsCount = 0;
      }
      flipCount++;
    }
    System.out.println("It took " + flipCount + " flips to get " + n + " heads in a row.");
  }

  public static void clock(){
    LocalDateTime now;
    while(true){
      now = LocalDateTime.now();
      System.out.println(now.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
      try
      {
          Thread.sleep(1000);
      }
      catch(InterruptedException ex)
      {
          Thread.currentThread().interrupt();
      }
    }
  }
}