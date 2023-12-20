public class WhileLoopChallenge {
  public static void main(String[] args) {

    int i = 4;
    int sumEven = 0;
    int sumOdd = 0;
    int evenCount = 0;
    int oddCount = 0;
    while (i <= 20) {
      i++;
      if (!isEvenNumber(i)) {
        oddCount++;
        sumOdd += i;
        continue;
      }
      System.out.println(i);
      evenCount++;
      sumEven += i;
    }
  }

  public static boolean isEvenNumber(int number) {
    if (number % 2 == 0) {
      return true;
    } else {
      return false;
    }
  }

}
