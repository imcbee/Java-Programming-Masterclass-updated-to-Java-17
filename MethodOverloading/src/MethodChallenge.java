public class MethodChallenge {
  public static void main(String[] args) {
    System.out.println(convertToCentimeters(5, 8));
    System.out.println(convertToCentimeters(61));
  }

  public static double convertToCentimeters(int height) {
    return (height * 2.54);
  }

  public static double convertToCentimeters(int heightFeet, int heightInches) {
    int toInches = heightFeet * 12;
    return convertToCentimeters(toInches + heightInches);
  }
}
