import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MinMaxChallenge {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList numberList = new ArrayList<>();

    String nextNumber = scanner.nextLine();

    while (true) {
      try {
        System.out.println("Add a number:");
        double number = Double.parseDouble(nextNumber);
        numberList.add(number);

      } catch (NumberFormatException nfe) {
        System.out.println("Not a number, quit loop.");
        break;
      }
    }

    System.out.println("Minimum number entered: " + Collections.min(numberList));
    System.out.println("Maximum number entered: " + Collections.max(numberList));
  }
}
