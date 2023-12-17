public class Main {

  public static void main(String[] args) {
    //! Expressions
    double kilometers = (100 * 1.609344); //this is an expression

    int highScore = 50;

    if (highScore > 25) {
      highScore = 1000 + highScore; // add bonus points
    }

    int health = 100;

    if ((health < 25) && (highScore > 1000)) { // there is a total of 6 expressions here
      highScore -= 1000;
    }

    //! White Spaces
    int myVariable = 50;

    myVariable++;
    myVariable--;

    System.out.println("this is a test");
    System.out.println("this is" +
      "another" +
      "a test");

    int anotherVariable = 50;
    myVariable--;
    System.out.println("Hard to read!");

    if (myVariable == 0) {
      System.out.println("It's more readable");
    }

    //! Code Blocks
    boolean gameOver = true;
    int score = 4000;
    int levelCompleted = 5;
    int bonus = 100;


    if (score < 5000 && score > 1000) {
      System.out.println("Your score was less than or equal to 5000");
    } else if (score < 1000) {
      System.out.println("Your score was less than 1000.");
    } else {
      System.out.println("Got here");
    }


  }
}
