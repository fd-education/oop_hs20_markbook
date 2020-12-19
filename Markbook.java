import java.util.ArrayList;

public class Markbook {
  private ArrayList<Mark> markbook;

  public Markbook() {
    markbook = new ArrayList<>();
  }

  public boolean newEntry(double mark) {
    return this.addMark(mark);
  }

  public int getSize() {
    return markbook.size();
  }

  public double getMark(int index) {
    return markbook.get(index).getValue();
  }

  public boolean getAllMarks() {
    try {
      returnAllMarks();
      return true;
    } catch (EmptyMarkbookException e) {
      System.out.println("XXX " + e + "Can't display a list of an empty book.");
      return false;
    }
  }

  private boolean addMark(double mark) {
    try {
      markbook.add(new Mark(mark));
      return true;
    } catch (InvalidMarkException e) {
      System.out.println("XXX " + e);
      return false;
    }
  }

  private void returnAllMarks() throws EmptyMarkbookException {
    if (markbook.size() == 0)
      throw new EmptyMarkbookException();

    int i = 0;

    for (Mark entry : markbook) {
      i++;
      System.out.println("Mark " + i + ": " + entry.getValue());
    }
  }
}