
/**
 * Write a description of class Square here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Square
{
   private int size;
   private String colour;
   
   public int getSize () {
       return size;
   }
   
   public String getColour () {
       return colour;
   }
   
   public void setSize (int size) {
       this.size = size;
   }
   
   public void setColour (String colour) {
       this.colour = colour;
   }
   
   ListNode lastItem = new ListNode (null, "last item");
   ListNode middleItem = new ListNode (lastItem, "middle item");
   ListNode firstItem = new ListNode (middleItem, "first item");
}
