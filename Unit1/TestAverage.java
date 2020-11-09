
/**
 * Write a description of class TestAverage here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestAverage
{
  public static void testEqualDoubles (double result, double expected){
    double tolerance = 0.0001;
    
    if ((result - expected < tolerance) && (expected - result < tolerance)) {
   
    } else {
        System.out.println("Error: the result " + result + " does not equal the expected " + expected);
    }
  }
  
  public static void testEqualBooleans (boolean result, boolean expected) {
      if (result == expected) {
        
      } else {
          System.out.println ("Error: the result " + result + " does not equal the expected " + expected);
      }
  }
  
  public static void testEqualStrings (String result, String expected){
      if ( result.equals (expected)) {
        
      } else {
          System.out.println ("Error: the result " + result + " does not equal the expected " + expected);
      }
  }
  
  public static void main (String[] args) {

    double[] numberList = {15, 32, 67, 44, 98};
    double[] emptyList = {};
    double[] singleList = {1};

    

    testEqualDoubles (Average.computeAverage (numberList), 51.2);
    testEqualDoubles (Average.computeAverage (emptyList), 0);
    testEqualDoubles (Average.computeAverage (singleList), 1);
    
    testEqualDoubles (Average.findSum (numberList), 256);
    testEqualDoubles (Average.findSum (emptyList), 0);
    testEqualDoubles (Average.findSum (singleList), 1);
  }
}
