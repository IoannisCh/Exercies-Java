
/**
 * Write a description of class ArrayInt here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArrayInt
{
   private int[] array;
   private int currentSize;
   private int maximumSize;
   
   public String toString () {
    String result = "";
    
    result = result + "[";
    for (int i=0; i<currentSize; i=i+1){
        result = result + array[i];
        if (i+1<currentSize){
            result = result + ", ";
        }
    }
    result = result + "]";
    
    return result;
   }
   
   public ArrayInt (int maximumSize, int currentSize){
       array = new int[maximumSize];
       this.maximumSize = maximumSize;
       this.currentSize = currentSize;
   }
   
   public void set (int value, int index) {
       if (index< 0 || index >= currentSize) {
           System.out.println("Error in set: index is out of bounds");
           return;
       }
       array[index] = value;
   }
   
   public int get (int index){
       if (index < 0 || index >= currentSize) {
           System.out.println ("Error in get: index is out of bounds");
           return -1;
       }
       return array[index];
   }
   
   public static void main (String[] args){
    ArrayInt arr1 = new ArrayInt (10,10);
    
    System.out.println ("Array 1: " + arr1);
    
    ArrayInt arr2 = new ArrayInt (10,5);
    
    System.out.println ("Array 2: " + arr2);
    
    ArrayInt arr3 = new ArrayInt (10,0);
    
    System.out.println ("Array 3: " + arr3);
   }
}
