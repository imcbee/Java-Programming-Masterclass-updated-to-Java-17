public class Loops {
  public static void main(String[] args) {
    for(double i = 2.0; i <= 5.0; i++) {
      System.out.println(i + "% and $ " + calcInterest(10000, i));
    }

    for(double i = 7.5; i <= 10.0; i += 0.25) {
      System.out.println(i + "% and $ " + calcInterest(100, i));
    }

    for(double i = 7.5; i <= 10.0; i += 0.25) {
      System.out.println(i + "% and $ " + calcInterest(100, i));
    }
  }

  public static double calcInterest(double amount, double interest) {
    return (amount * (interest / 100));
  }
}
