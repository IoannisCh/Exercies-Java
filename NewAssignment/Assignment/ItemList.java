public class ItemList {
    private ListNodes head;
    private int count;
    public ItemList () {
        head = null;
        count = 0;
    }
    
    public void join (ObservedItem data) {
        if (head == null) {      
            head = new ListNodes (null, data);
            return;              
        } else {
            head.join (data);
            count ++;
        }
    }

    public ObservedItem leave () {
        if (head == null) {
            return null;
        } else {
            ObservedItem result = head.getData ();
            head = head.getNext ();
            return result;
        }
    }

    public ObservedItem get (int index) {
        if (head == null) {
            throw new ArrayIndexOutOfBoundsException (index);
        } else {
            return head.get (index);
        }
    }

    public void set (ObservedItem data, int index) {
        if (head == null) {
            throw new ArrayIndexOutOfBoundsException (index);
        } else {
            head.set (data, index);
        }
    }

    public void insert (ObservedItem data, int index) {  
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
            count--;
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
    
    public void print(){
        for (int i=0; i<=this.size(); i++){
            if (this.get(i).getFlag() == true){
                 System.out.println ("Item: " + this.get(i).getId()+ ", " + this.get(i).getName() + ", " + "yes" +", " + this.get(i).getDate());
            } else {
                 System.out.println ("Item: " + this.get(i).getId()+ ", " + this.get(i).getName() + ", " + "no");
            }
        }
        System.out.println(this.size());
    }
    
    //
    
    public void swap ( ObservedItem i1, ObservedItem i2, int index) {
          ObservedItem temp;

          temp = i1;
          this.set(i2, index); //
          this.set(temp, index+1); //
    }
    
    //
    
    public void sort(){
        boolean madeSwap; // flag to stop iteration                                     

        do {                                                  
            madeSwap = false;  //                               
            for (int i = 0; i < this.size(); i++) {  
                if (this.get(i).getId() > this.get(i+1).getId()) {                  
                    swap (this.get(i),this.get(i+1), i); //                      
                    madeSwap = true;                                
                }
            }
        } while (madeSwap);                                 
    }
    
    public int binarySearch(String[] a, String x) {
        int low = 0;
        int high = a.length - 1;
        int mid;
        
        while (low <= high) {
            mid = (low + high) / 2;

            if (a[mid].compareTo(x) > 0) {
                low = mid + 1;
                
            } else if (a[mid].compareTo(x) < 0) {
                high = mid - 1;
                
            } else {
                return mid;
            }
        }

        return -1;
    }
}