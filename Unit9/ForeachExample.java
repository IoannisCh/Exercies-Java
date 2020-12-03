/**
 * Write a description of class ForeachExample here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ForeachExample
{
    public static void main (String[] args) {
    List<String> list = new ArrayList<> ();
    list.add("Alice");
    list.add("Bill");
    list.add("Charles");
    list.add("Dave");
    
    for (String item: list) {
        System.out.println ("List contains: " + item);
    }
    }   
}
