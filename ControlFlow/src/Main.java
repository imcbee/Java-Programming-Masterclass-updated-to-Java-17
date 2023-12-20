public class Main {
  public static void main(String[] args) {
    int value = 4;
    if (value == 1) {
      System.out.println("Value was 1");
    } else if (value == 2) {
      System.out.println("Value was 2");
    } else {
      System.out.println("Was not 1 or 2");
    }

    switch (value) {
      case 1:
        System.out.println("Value was 1");
        break;
      case 2:
        System.out.println("Value was 2");
        break;
      case 3: case 4: case 5:
        System.out.println("Was a 3, 4, or a 5");
        System.out.println("it was " + value);
        break;
      default:
        System.out.println("Was not 1 , 2, 3, 4, 5");
        break;
    }
  }

  public static String getQuarter(String month) {

    switch (month) {
      case "JANUARY", "FEBRUARY", "MARCH" -> {
        return "1st";
      }
      case "APRIL", "MAY", "JUNE" -> {
        return "2nd";
      }
      case "JULY", "AUGUST", "SEPTEMBER" -> {
        return "3rd";
      }
      case "OCTOBER", "NOVEMBER", "DECEMBER" -> {
        return "4th";
      }
      default -> {
        String badResponse = month + " is bad";
        return badResponse;
      }
    }
  }
}
