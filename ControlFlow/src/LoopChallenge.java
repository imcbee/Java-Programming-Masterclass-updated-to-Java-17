public class LoopChallenge {
  public static void main(String[] args) {
    for(int i = 0; i <= 17; i++) {
      System.out.println(i + " is " + (isPrime(i) ? "" : "NOT ") + " a prime number.");
    }

    for(int i = 10; i<= 50; i++) {
      if(isPrime(i)) {
        System.out.println(i + " is a prime number.");
      }
    }
  }

  public static boolean isPrime(int wholeNumber) {
    if (wholeNumber <= 2) {
      return (wholeNumber == 2);
    }

    for(int i = 2; i <= (wholeNumber / 2); i++) {
      if (wholeNumber % i == 0) {
        return false;
      }

    }

    return true;
  }
}
