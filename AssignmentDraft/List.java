public class List<T> {
    private ListNode<T> head;
    private int count;
    public List () {
        head = null;
        count = 0;
    }
    
    public void join (T data) {
        if (head == null) {      
            head = new ListNode<T> (null, data);
            return;              
        } else {
            head.join (data);
            count ++;
        }
    }

    public T leave () {
        if (head == null) {
            return null;
        } else {
            T result = head.getData ();
            head = head.getNext ();
            return result;
        }
    }

    public T get (int index) {
        if (head == null) {
            throw new ArrayIndexOutOfBoundsException (index);
        } else {
            return head.get (index);
        }
    }

    public void set (T data, int index) {
        if (head == null) {
            throw new ArrayIndexOutOfBoundsException (index);
        } else {
            head.set (data, index);
        }
    }

    public void insert (T data, int index) {  
        if (head == null) {
            join (data);
        } else {
            head = head.insert (data, index);
        }
    }

    public void delete (int index) {
        if (head == null) {
            throw new ArrayIndexOutOfBoundsException (index);
        } else {
            head = head.delete (index);
        }
    }

    public String toString () {
        if (head == null) {
            return "[]";
        } else {
            return head.toString ();
        }
    }
    
    public int size (){
        if (head == null){
            return 0;
        } else {
            return count;
        }
    }
    
    
    
    
    
}