public class MethodOverloading {
  public static void main(String[] args) {
    int newScore = calculateScore("Tim", 500);
    System.out.println("New score is " + newScore);

    calculateScore(75);
    calculateScore();


  }

  public static int calculateScore(String playerName, int score) {
    System.out.println("Player " + playerName + " scored " + score + " points");
    return score * 1000;
  }

  public static int calculateScore(int score) {
    return calculateScore("anon", score);
  }

  public static int calculateScore() {
    System.out.println("No player score");
    return 0;
  }

}
