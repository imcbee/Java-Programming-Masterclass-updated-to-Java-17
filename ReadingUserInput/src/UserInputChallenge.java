import java.util.Scanner;

public class UserInputChallenge {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int counter = 1;
    double sum = 0;

    do {
      System.out.println("Enter in a number # " + counter + ": ");
      String nextNumber = scanner.nextLine();

      try {
        double number = Double.parseDouble(nextNumber);
        counter++;
        sum += number;
      } catch (NumberFormatException nfe) {
        System.out.println("Invalid Number! ");
      }

    } while(counter <= 5);
  }
}
