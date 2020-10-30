
/**
 * Write a description of class TestArrayInt here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestArrayInt
{
    public static void testEqualStrings (String result, String expected) {

        if (result.equals (expected)) {
            // do nothing
        } else {
            System.out.println ("Error: the result " + result + " does not equal the expected " + expected);
        }
    }

    public static void main (String[] args) {
        System.out.println ("Testing ...");       // <1>

        ArrayInt arr1 = new ArrayInt (10, 10);

        testEqualStrings (arr1.toString(), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");

        ArrayInt arr2 = new ArrayInt (10, 5);

        testEqualStrings (arr2.toString(), "[0, 0, 0, 0, 0]");

        ArrayInt arr3 = new ArrayInt (10, 0);

        testEqualStrings (arr3.toString(), "[]");

        System.out.println ("DONE");              // <1>
    }
}