public class ItemList {
    private ListNodes head;
    private int count;
    public ItemList () {
        head = null;
        count = 0;
    }
    //bellow the join support method
    public void join (ObservedItem data) {
        if (head == null) {      
            head = new ListNodes (null, data);
            return;              
        } else {
            head.join (data);
            count ++;
        }
    }
    //bellow the leave support method
    public ObservedItem leave () {
        if (head == null) {
            return null;
        } else {
            ObservedItem result = head.getData ();
            head = head.getNext ();
            return result;
        }
    }
    //bellow the get support method
    public ObservedItem get (int index) {
        if (head == null) {
            throw new ArrayIndexOutOfBoundsException (index);
        } else {
            return head.get (index);
        }
    }
    //bellow the set support method
    public void set (ObservedItem data, int index) {
        if (head == null) {
            throw new ArrayIndexOutOfBoundsException (index);
        } else {
            head.set (data, index);
        }
    }
    
    //bellow the insert support method
    
    public void insert (ObservedItem data, int index) {  
        if (head == null) {
            join (data);
        } else {
            head = head.insert (data, index);
        }
    }
    
    //bellow the delete method
    
    public void delete (int index) {
        if (head == null) {
            throw new ArrayIndexOutOfBoundsException (index);
        } else {
            count--;
            head = head.delete (index);
        }
    }
    
    //bellow the toString support method
    
    public String toString () {
        if (head == null) {
            return "[]";
        } else {
            return head.toString ();
        }
    }
    
    //bellow is the size support method
    
    public int size (){
        if (head == null){
            return 0;
        } else {
            return count;
        }
    }
    
    //bellow is the print method for task three
    
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
    
    //bellow is the swap supporting function
    
    public void swap ( ObservedItem i1, ObservedItem i2, int index) {
          ObservedItem temp;

          temp = i1;
          this.set(i2, index); 
          this.set(temp, index+1); 
    }
    
    //bellow is the sort method for task three
    
    public void sort(){
        boolean madeSwap; // flag to stop iteration                                     

        do {                                                  
            madeSwap = false;  //                               
            for (int i = 0; i < this.size(); i++) {  
                if (this.get(i).getId() > this.get(i+1).getId()) {                  
                    swap (this.get(i),this.get(i+1), i); // here the swap is made                    
                    madeSwap = true;                                
                }
            }
        } while (madeSwap);                                 
    }
    
    //bellow is the search support method to the delete function for task five
    
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