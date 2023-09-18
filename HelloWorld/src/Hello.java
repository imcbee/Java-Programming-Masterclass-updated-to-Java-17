public class Hello {

  public static void main(String[] args) {
    System.out.println("Hello World");

    boolean isAlien = false;
    if (!isAlien) {
      System.out.println("It is not an alien!");
      System.out.println("And I am afraid of aliens!");
    }

    int topScore  = 82;
    if (topScore < 100) {
      System.out.println("You got the high score!");
    }

    int secondTopScore = 81;
    if ((topScore > secondTopScore) && (topScore < 100)) {
      System.out.println("Greater than second top score and less than 100");
    }

    if(topScore> 90 || secondTopScore <= 90) {
      System.out.println("Either or both of the conditions are true");
    }

    int newValue = 50;
    if (newValue == 50) {
      System.out.println("This is an true");
    }

    boolean isCar = false;
    if (!isCar) {
      System.out.println("This is not supposed to happen.");
    }

    String makeOfCar = "Volkswagen";
    boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;
    if (isDomestic) {
      System.out.println("This car is domestic to our country");
    }

    String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";
    System.out.println(s);

    //? Challenge
    double value1 = 20.00d;
    double value2 = 80.00d;
    double added = (value1 + value2) * 100.00d;
    double remainderOfAdded = added % 40.00d;
    boolean isTrue;

//    if (remainderOfAdded == 0.00) {
//      isTrue = true;
//    } else {
//      isTrue = false;
//    }

    isTrue = remainderOfAdded == 0.00; //! Same thing as above

    System.out.println(isTrue);
    if (!isTrue) {
      System.out.println("got some remainder");
    }




  }
}
