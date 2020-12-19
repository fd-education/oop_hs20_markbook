public class Interface {
  public Interface() {
    welcome();
  };

  public void welcome() {
    System.out.println("============================================================================================");
    System.out.println("                                 Welcome to your markbook!");
    System.out.println("____________________________________________________________________________________________");
  }

  public void chooseOperation() {
    System.out.println("                       Press a key to choose your desired operation: \n"
        + "                >> (A) Average of all marks, (B) Best mark, (W) Worst Mark\n"
        + "                >> (N) New Mark, (L) List of all marks, (C) Close markbook");
  }

  public void enterMark() {
    System.out.println("\n>> Please enter the new mark (1 to 6): ");
  }

  public void responseText(String feature, double mark) {
    System.out.println("\n>> Your " + feature + " mark is: " + mark + ". \n");
    System.out.println("____________________________________________________________________________________________");
  }

  public void confirmEntry(double mark) {
    System.out.println("\n>> " + mark + " was added to your markbook.");
    System.out.println("____________________________________________________________________________________________");
  }

  public void goodbye() {
    System.out.println("____________________________________________________________________________________________");
    System.out.println("                                    Have a nice day!");
    System.out.println("============================================================================================");
  }

}
