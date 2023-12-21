public class ReadingUserInput {
  public static void main(String[] args) {
    int currentYear = 2022;
    String usersDateOfBirth = "1999";
    int dateOfBrith = Integer.parseInt(usersDateOfBirth);

    //System.out.println("Age = " + (currentYear - dateOfBrith));

    String usersAgeWithPartialYear = "22.5";
    double ageWithPartialYear = Double.parseDouble(usersAgeWithPartialYear);

    //System.out.println("The user says he's " + ageWithPartialYear);

    System.out.println(getInputFromConsole(currentYear));
    System.out.println(getInputFromScanner(currentYear));
  }

  public  static String getInputFromConsole(int currentYear) {
    String name = System.console().readLine("Hi, What's your name? ");
    System.out.println("Hi " + name + ", Thanks for taking the course!");

    String dateOfBirth = System.console().readLine("WHat year were you born? ");
    int age = currentYear - Integer.parseInt(dateOfBirth);

    return "So you are " + age + " years old.";
  }

  public  static String getInputFromScanner(int currentYear) {
    return "";
  }
}
