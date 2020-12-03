
/**
 * Write a description of class TestFramework here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestFramework {
  public static String arrayToString(int[] array) {
      String result = "";
      
      result += "[";
      
      for (int i=0; i<array.length; i+=1){
          result += array[i] + ", ";
      }
      result +="]";
      
      return result;
  }  
  
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

  public static void testEqualIntArrays (int[] result, int[] expected){
      boolean equalArrays;
      
      if ( result.length == expected.length){
          for (int i=0; i<result.length; i=i+1){
              if (result[i] == expected[i]){
               equalArrays = true;
               
              } else {
                  equalArrays = false;
                  System.out.println("Element: " + result[i] + " Does not equal the expected: " + expected[i]);
                  break;
              }
        }
        System.out.println("The arrays are equal, bro !!");
      } else {
          System.out.println ("Error: the result " + arrayToString(result) + " does not equal the expected " + arrayToString(expected));
              }
  }
  
  public static void main (String args []){
      int[] emptyArray = {};
      int[] oneArray = {1};
      int[] duplicatedArray = {1, 2, 3, 2, 1, 3};
      int[] variousArray = {1, 2, 3, 4, 5, 6};
      
      
      testEqualIntArrays(emptyArray, emptyArray);
      testEqualIntArrays(oneArray, variousArray);
      testEqualIntArrays(duplicatedArray,duplicatedArray);
      testEqualIntArrays(variousArray,variousArray);
      
      
      
  }
}