import java.util.Scanner;

public class Input {
  private Scanner scn = new Scanner(System.in);
  private String[] VALID_COMMANDS = { "a", "b", "c", "w", "n", "l" };

  public Input() {
  };

  public String getCommandInput() {
    return scn.nextLine();
  }

  public double getMarkInput() {
    return scn.nextDouble();
  }

  public boolean isValid(String command) {
    return checkValidity(command);
  }

  private boolean checkValidity(String command) {
    boolean valid = false;

    for (String entry : VALID_COMMANDS) {
      valid = entry.equals(command);
      if (valid)
        break;
    }

    return valid;
  }
}
