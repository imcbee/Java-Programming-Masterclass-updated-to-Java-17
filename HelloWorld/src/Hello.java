public class Hello {

  public static void main(String[] args) {
    System.out.println("Hello World");

    boolean isAlien = false;
    if (!isAlien) {
      System.out.println("It is not an alien!");
      System.out.println("And I am afraid of aliens!");
    }

    int topScore  = 82;
    if (topScore < 100) {
      System.out.println("You got the high score!");
    }

    int secondTopScore = 81;
    if ((topScore > secondTopScore) && (topScore < 100)) {
      System.out.println("Greater than second top score and less than 100");
    }

    if(topScore> 90 || secondTopScore <= 90) {
      System.out.println("Either or both of the conditions are true");
    }

  }
}