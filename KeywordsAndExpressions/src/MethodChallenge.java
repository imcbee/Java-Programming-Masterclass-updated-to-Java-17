public class MethodChallenge {
  public static void main(String[] args) {
    int highScorePosition = calculateHighScorePosition(1500);
    displayHighScorePosition("Ian", highScorePosition);

    highScorePosition = calculateHighScorePosition(1000);
    displayHighScorePosition("Ian", highScorePosition);

    highScorePosition = calculateHighScorePosition(500);
    displayHighScorePosition("Ian", highScorePosition);

    highScorePosition = calculateHighScorePosition(100);
    displayHighScorePosition("Ian", highScorePosition);

    highScorePosition = calculateHighScorePosition(25);
    displayHighScorePosition("Ian", highScorePosition);

  }

  public static void displayHighScorePosition(String playerName, int playerPosition) {
    System.out.println(playerName + " managed to get into position " + playerPosition + " on the high score list.");
  }

  public static int calculateHighScorePosition(int playerScore) {
    int position;

    if (playerScore >= 1000){
      position = 1;
    } else if (playerScore >= 500) {
      position = 2;
    } else if (playerScore >= 100) {
      position = 3;
    } else {
      position = 4;
    }
    return position;
  }
}
