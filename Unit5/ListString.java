
/**
 * Write a description of class ListString here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ListString
{
   private ListNode head;
   
   public ListString () {
       head = null;
   }
   
   public void join (String data) {
       if (head == null) {
           head = new ListNode (null, data);
       } else {
           head.join (data);
       }
   }
   
   public String leave (){
       return "";
   }
   
   public String get (int index){
       
       return "";
   }
   
   public void set (String data, int index){
       
   }
   
   public void insert (String data, int index){
       
   }
   
   public void delete (int index){
       
   }
}
