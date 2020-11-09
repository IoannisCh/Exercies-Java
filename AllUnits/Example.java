import java.util.*;
import mylib.Example2;

public class Example {
    public static void hello () {
        System.out.println ("Hello from Example");
        Example2.hello ();
    }

    public static void main (String[] args) {
        List<String> list = new ArrayList<> ();
        list.add ("red");
        list.add ("green");
        list.add ("blue");

        Iterator<String> it = list.iterator ();

        while (it.hasNext ()) {
            String item = it.next ();
            System.out.println ("Item is: " + item);
        } 

        int sum=0;
        int[] numbers = {1,2,3};

        for (int number : numbers) {
            sum += number;
        }
    }
}
