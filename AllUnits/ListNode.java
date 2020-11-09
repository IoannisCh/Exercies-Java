
/**
 * Write a description of class ListNode here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ListNode {
  private ListNode next;
  private String data;

  public ListNode (ListNode next, String data) {
    this.next = next;
    this.data = data;
  }
  public String toString () {
    String result = "";

    result += "[";
    ListNode current = this;

    while (current != null) {
      result += current.data;
      if (current.next != null) {
        result += ", ";
      }
      current = current.next;
    }

    result += "]";

    return result;
  }
}