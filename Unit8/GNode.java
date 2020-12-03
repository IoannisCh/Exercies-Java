
/**
 * Write a description of class GNode here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GNode<T>
{
   private T value;
   private List<GNode<T>> links;
   
   public GNode (T value) {
       this.value = value;
       links = new List<GNode<T>> ();
   }
   
   public void addLink (GNode<T> to) {
       links.join (to);
   }
   
   public int countNodes (List<GNode<T>> visited) {
    int sum = 0;

    if (!visited.contains(this)) {
        visited.join (this);
        sum += 1;
    }

    for (int i=0; i<links.size(); i += 1) {
        GNode<T> child = links.get(i);
        if (!visited.contains(child)) {
            sum += child.countNodes (visited);
        }
    }

    return sum;
   }
   
    public boolean contains (T data) {
        ListNode<T> current = head;
        while (current != null) {
            if (current.getData().equals(data)) {
                return true;
            }
            current = current.getNext ();
        }
        return false;
    }
    
    public boolean isEven () {
        int n = links.size ();
        return n%2 == 0;
    }   
    
    public boolean isEulerian () {
        for (int i=0; i<nodes.size(); i+=1) {
            GNode<T> node = nodes.get (i);
            if (!node.isEven ()) {
                return false;
            }
        }
        return true;
    }
}
