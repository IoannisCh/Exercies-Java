
/**
 * Write a description of class ArrayInt here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArrayInt {

  private int[] array;
  private int currentSize;
  private int maximumSize;
  
 public String toString () {
    String result = "";

    result = result + "[";
    for (int i=0; i<currentSize; i=i+1) {
      result = result + array[i];
      if (i+1<currentSize) {     // only add the ", " if we are not at the end
        result = result + ", ";
      }
    }
    result = result + "]";

    return result;
  }
  
  public ArrayInt (int maximumSize, int currentSize) {
    array = new int[maximumSize];
    this.maximumSize = maximumSize;
    this.currentSize = currentSize;
  }
  
public void set (int value, int index) {
  if (index < 0 || index >= currentSize) {
    // For now, print and ignore, but we will change this later.
    System.out.println ("Error in set: index is out of bounds");
    return;
  }

  array[index] = value;
}

public int get (int index) {
   if (index < 0 || index >= currentSize) {
            // For now, print and ignore, but we will change this later.
            System.out.println ("Error in get: index is out of bounds");
            return -1;    // <1>
        }

   return array[index];
}

public void delete (int index) {
        if (index < 0 || index >= currentSize) {
            // For now, print and ignore, but we will change this later.
            System.out.println ("Error in delete: index is out of bounds");
            return;
        }

        for (int i=index; i<currentSize-1; i=i+1) {
            array[i] = array[i+1];
        }
        currentSize = currentSize - 1;
    }

public class StackString {

  public String[] array;
  public int currentSize;
  public int maximumSize;

  public StackString (int maximumSize) {
    array = new String[maximumSize];
    this.maximumSize = maximumSize;
    this.currentSize = 0;             // our stack starts empty
  }

  // toString can be copied from ArrayInt
}    
    
 public boolean isEmpty () {
        return currentSize == 0;
    }


public static void main (String[] args) {
    ArrayInt arr1 = new ArrayInt (10, 10);

    System.out.println ("Array 1: " + arr1);

    ArrayInt arr2 = new ArrayInt (10, 5);

    System.out.println ("Array 2: " + arr2);

    ArrayInt arr3 = new ArrayInt (10, 0);

    System.out.println ("Array 3: " + arr3);
   
  
}
}