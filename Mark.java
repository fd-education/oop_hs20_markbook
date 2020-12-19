public class Mark {
  private double MAX_MARK = 6;
  private double MIN_MARK = 1;
  private double mark;

  public Mark(double mark) throws InvalidMarkException {
    if (mark < MIN_MARK || mark > MAX_MARK) {
      throw new InvalidMarkException();
    } else {
      this.mark = mark;
    }
  }

  public double getValue() {
    return this.mark;
  }
}