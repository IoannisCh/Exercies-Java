
/**
 * Write a description of class TestFramework here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestFramework {
  public void testEqualDoubles (double result, double expected) {
    double tolerance = 0.0001; // we hard-code this constant into the function

    if ((result - expected < tolerance) &&
        (expected - result < tolerance)) {
      // do nothing
    } else {
      System.out.println ("Error: the result " + result +
                          " does not equal the expected " + expected);
    }
  }

    public static void testEqualIntArrays (double array1[i], double array2[j]){
  
      if ( array1[i].length == array2[j].length && i == j)
        System.out.println("arrays are equal");
  }
  // include testEqualArrays etc

}