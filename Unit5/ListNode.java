/**
 * Write a description of class ListNode here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ListNode
{
   private ListNode next;
   private String data;
   
   public ListNode (ListNode next, String data){
       this.next = next;
       this.data = data;
   }
   
   public void set (String data, int i) {
       ListNode current = this;
       int currentIndex = 0;
       
       while (current != null) {
           if (currentIndex == i) {
               current.data = data;
               return;
           }
           currentIndex += 1;
           current = current.getNext ();
       }
       throw new ArrayIndexOutOfBoundsException (i);
   }
   
   public String get (int i) {
       ListNode current = this;
       int currentIndex = 0;
       
       while (current != null) {
           if (currentIndex == i) {
               return current.getData();
           }
           currentIndex += 1;
           current = current.getNext();
       }
       throw new ArrayIndexOutOfBoundsException (i);
   }
   
   public ListNode insert (String data, int index) {
       ListNode current = this;
       int currentIndex = 0;
       if (index <0) {
           throw new ArrayIndexOutOfBoundsException (index);
       }
       
       if (index == 0) {
           return new ListNode (current, data);
       }
       
       while (current != null) {
           if (currentIndex+1 == index){
               ListNode insertedNode = new ListNode (current.getNext(), data);
               current.next = insertedNode;
               return this;
           }
           currentIndex +=1;
           current = current.getNext ();
       }
       throw new ArrayOutOfBoundsException (index);
   }
   
   public ListNode delete (int index) {
       ListNode current = this;
       int currentIndex = 0;
       
       if (index == 0) {
           return next;
       }
       
       while (current != null) {
           if (currentIndex+1 == index) {
               current.setNext (current.getNext().getNext());
               
               return this;
           }
           currentIndex += 1;
           current = current.getNext ();
       }
       throw new ArrayIndexOutOfBoundsException (index);
   }
   
   public int size () {
       int result = 0;
       
       ListNode current = head;
       
       while (current != null) {
           result += 1;
           current = current.next;
       }
       return result;
   }
   
   public String toString(){
       String result = "";
       
       result += "[";
       ListNode current = this;
       
       while (current != null){
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
