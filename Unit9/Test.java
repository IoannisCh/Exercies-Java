/**
 * Write a description of class Test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Iterator;

public class Test {
    public static void main (String[] args) {
        List<String> list = new List<> ();
        list.join ("A");
        list.join ("B");
        list.join ("C");

        System.out.println ("Using a standard for-loop");
        for (int i=0; i < list.size() ; i+=1) {
            System.out.println ("Item at index " + i + " is " + list.get(i));
        }

        System.out.println ("Using an iterator");
        Iterator<String> it = list.iterator ();
        while (it.hasNext ()) {
            String item = it.next();
            System.out.println ("List contains: " + item);
        }

        System.out.println ("Using a for-each loop");
        for (String item : list) {
            System.out.println ("- " + item);
        }
    }
}
