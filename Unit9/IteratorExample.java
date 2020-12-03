/**
 * Write a description of class IteratorExample here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample
{
    public static void main (String[] args){
        List<String> list = new ArrayList<> ();
        list.add("Alice");
        list.add("Bill");
        list.add("Charles");
        list.add("Dave");
        
        Iterator<String> it = list.iterator ();
        while (it.hasNext()){
            String item = it.next();
            System.out.println("List contains: " + item);
        }
    }
}
