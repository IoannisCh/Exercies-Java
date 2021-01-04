public class ListNode<T> {
    private ListNode<T> next;
    private T data;

    public ListNode (ListNode<T> next, T data) {
        this.next = next;
        this.data = data;
    }

    // accessor for 'next'
    public ListNode<T> getNext () {
        return next;
    }

    // mutator for 'next'
    public void setNext (ListNode<T> next) {
        this.next = next;
    }

    // accessor for 'data' field
    public T getData () {
        return data;
    }

    public void join (T data) {
        ListNode<T> current = this;

        // walk the list to find the last item
        while (current.getNext () != null) {
            current = current.getNext ();
        }

        // make a new node from data and place it in the lastItem
        current.setNext (new ListNode<T> (null, data));              // <1>
    }

    public T get (int i) {
        ListNode<T> current = this;
        int currentIndex = 0;

        while (current != null) {
            if (currentIndex == i) {
                return current.getData ();
            }
            currentIndex += 1;
            current = current.getNext ();
        }
        throw new ArrayIndexOutOfBoundsException (i); // <1>
    }

    public void set (T data, int i) {
        ListNode<T> current = this;
        int currentIndex = 0;

        while (current != null) {
            if (currentIndex == i) {
                current.data = data;
                return;
            }
            currentIndex += 1;
            current = current.getNext ();
        }
        throw new ArrayIndexOutOfBoundsException (i); // <1>
    }

    public ListNode<T> insert (T data, int index) {
        ListNode<T> current = this;
        int currentIndex = 0;
        if (index < 0) { // check index is positive
            throw new ArrayIndexOutOfBoundsException (index);
        }

        if (index == 0) {  
            return new ListNode (current, data);
        }

        while (current != null) {
            if (currentIndex+1 == index) {                                 
                ListNode<T> insertedNode = new ListNode<T> (current.getNext(), data); 
                current.next = insertedNode;                                    
                return this;    
            }
            currentIndex += 1;
            current = current.getNext ();
        }
        throw new ArrayIndexOutOfBoundsException (index); 
    }

    // deletes node at given index number, and returns head of new list
    public ListNode<T> delete (int index) {
        ListNode<T> current = this;
        int currentIndex = 0;

        if (index == 0) { // delete first node, so just return the next node
            return next;
        }

        while (current != null) {
            if (currentIndex+1 == index) {
                // the node to delete is the next one
                // so we set the current node's next to the next of the next
                current.setNext ( current.getNext().getNext());

                return this; // remember, the delete method was called on the first item
            }
            currentIndex += 1;
            current = current.getNext ();
        }
        throw new ArrayIndexOutOfBoundsException (index);  
    }

    public String toString () {
        String result = "";

        result += "[";
        ListNode<T> current = this;

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