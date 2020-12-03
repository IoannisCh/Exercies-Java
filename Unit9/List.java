/**
 * Write a description of class List here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Iterator;

public class List<T> implements Iterable<T> 
{
      public Iterator<T> iterator(){
          return new ListIterator<T> (head);
      }
      
      private class ListIterator<T> implements Iterator<T> {
          private ListNode<T> next;
          
          public ListIterator (ListNode<T> next){
              this.next = next;
          }
          
          public boolean hasNext () {
              return next != null;
          }
          
          public T next () {
              ListNode<T> result = next;
              next = next.next;
              return result.data;
          }
          
          public void remove () {
              throw new UnsupportedOperationExemption ();
          }
      }
}
