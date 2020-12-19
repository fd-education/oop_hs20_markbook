public class InvalidMarkException extends Exception {
  public InvalidMarkException() {
    super("This mark is invalid. The mark's value should range from 1 to 6. \n");
  }
}