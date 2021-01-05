public class Lists {
    private ListNodes head;
    private int count;
    public Lists () {
        head = null;
        count = 0;
    }
    
    public void join (LoanItem data) {
        if (head == null) {      
            head = new ListNodes (null, data);
            return;              
        } else {
            head.join (data);
            count ++;
        }
    }

    public LoanItem leave () {
        if (head == null) {
            return null;
        } else {
            LoanItem result = head.getData ();
            head = head.getNext ();
            return result;
        }
    }

    public LoanItem get (int index) {
        if (head == null) {
            throw new ArrayIndexOutOfBoundsException (index);
        } else {
            return head.get (index);
        }
    }

    public void set (LoanItem data, int index) {
        if (head == null) {
            throw new ArrayIndexOutOfBoundsException (index);
        } else {
            head.set (data, index);
        }
    }

    public void insert (LoanItem data, int index) {  
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
            count--;
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
    
        /*public static int binarySearch (String[] titles, String toFind) {
        int l = 0;
        int r = titles.length - 1;

        while (l <= r) {
            int m = (l + r)/2;  
            
            if (toFind.equals(titles[m])) {       
            return m;
            } else if (toFind.compareTo(titles[m])) { 
            r = m-1;
            } else {  
            l = m+1;
            }
        }

  
        return -1;
    }*/
    
    
    
}