/**
 * Write a description of class TestSet here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.HashSet;
import java.util.Set;


public class TestSet
{
   public static void main (String[] args){
       Set<String> myset = new HashSet<> ();
       myset.add ("Peter");
       myset.add ("John");
       myset.add ("Luke");
       myset.add ("Matthew");
       myset.add ("Peter");
       
       System.out.println ("Number of names is: " + myset.size());
       for (String name : myset) {
           System.out.println ("Name" + name);
       }
       
       System.out.println ("Is 'John' in the set?" + myset.contains("John"));
       System.out.println ("Is 'David' in the set?" + myset.contains("David"));   
}
}
