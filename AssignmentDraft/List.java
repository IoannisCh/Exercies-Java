public class List<T> {
    private ListNode<T> head;
    public List () {
        head = null;
    }
    
    public void join (T data) {
        if (head == null) {      
            head = new ListNode<T> (null, data);
            return;              
        } else {
            head.join (data);
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
}