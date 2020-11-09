import java.util.Iterator;

public class Test {
    public static void main (String[] args) {
        List<String> list = new List<> ();
        list.join ("A");
        list.join ("B");
        list.join ("C");

        System.out.println ("Using a standard for-loop");
        for (int i=0; i < list.size () ; i+=1) {
            System.out.println ("Item at index " + i + " is " + list.get(i));
        }

        System.out.println ("Using an iterator");
        Iterator<String> it = list.iterator ();     // <1>
        while (it.hasNext ()) {                     // <2>
            String item = it.next();                  // <3>
            System.out.println ("List contains: " + item);
        }

        System.out.println ("Using a for-each loop");
        for (String item : list) {
            System.out.println ("- " + item);
        }
    }
}