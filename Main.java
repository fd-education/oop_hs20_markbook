public class Main {

  private static Calculator calc = new Calculator();
  private static Markbook markbook = new Markbook();
  private static Interface textInterface = new Interface();
  private static Input input = new Input();

  public static void main(String[] args) {
    boolean running = true;

    do {
      try {
        textInterface.chooseOperation();
        running = inputHandler(input.getCommandInput().toLowerCase());
      } catch (UnknownCommandException e) {
        System.out.println("XXX " + e);
        running = true;
      }

    } while (running);

  }

  public static boolean inputHandler(String command) throws UnknownCommandException {

    if (!input.isValid(command)) {
      throw new UnknownCommandException();
    }

    boolean r = true;

    switch (command) {
      case ("a"):
        try {
          textInterface.responseText("average", calc.getAverage(markbook));
        } catch (EmptyMarkbookException e) {
          System.out.println("XXX " + e);
        }
        r = true;
        break;

      case ("b"):
        try {
          textInterface.responseText("best", calc.getBestMark(markbook));
        } catch (EmptyMarkbookException e) {
          System.out.println("XXX " + e);
        }
        r = true;
        break;

      case ("w"):
        try {
          textInterface.responseText("worst", calc.getWorstMark(markbook));
        } catch (EmptyMarkbookException e) {
          System.out.println("XXX " + e);
        }
        r = true;
        break;

      case ("l"):
        markbook.getAllMarks();
        r = true;
        break;

      case ("n"):
        boolean valid = false;

        do {
          textInterface.enterMark();
          double mark = input.getMarkInput();
          valid = markbook.newEntry(mark);
          textInterface.confirmEntry(mark);
        } while (!valid);

        r = true;
        break;

      case ("c"):
        textInterface.goodbye();
        r = false;
        break;
    }

    return r;
  }
}
