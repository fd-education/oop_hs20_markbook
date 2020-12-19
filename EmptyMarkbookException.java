public class EmptyMarkbookException extends Exception {
  public EmptyMarkbookException() {
    super("Your desired operation is not possible on an empty markbook.");
  }
}