
/**
 * Write a description of class StackString here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StackString {

  public String[] array;
  public int currentSize;
  public int maximumSize;

  public StackString (int maximumSize) {
    array = new String[maximumSize];
    this.maximumSize = maximumSize;
    this.currentSize = 0;             // our stack starts empty
  }

  // toString can be copied from ArrayInt
}
