public class UnknownCommandException extends Exception {
  public UnknownCommandException() {
    super("\nI don't know what you mean. Please try a valid command! \n");
  }
}
