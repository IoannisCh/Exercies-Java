
/**
 * Write a description of class TestListNode here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestListNode
{
    public static ListNode test () {
        ListNode lastItem = new ListNode (null, "last item");
        ListNode middleItem = new ListNode (lastItem, "middle item");
        ListNode firstItem = new ListNode (middleItem, "first item");
        
        return firstItem;
    }
}
