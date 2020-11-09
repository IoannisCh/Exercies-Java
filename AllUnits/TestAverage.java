
/**
 * Write a description of class TestAverage here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class TestAverage {
public static void testEqualDoubles (double result, double expected) {
  double tolerance = 0.0001; // we hard-code this constant into the function

  if ((result - expected < tolerance) &&
        (expected - result < tolerance)) {
      // do nothing
    } else {
      System.out.println ("Error: the result " + result +
                          " does not equal the expected " + expected);
    }
  }

public static String arrayToString (int[] array) {
    String result = "";

    result += "[";
    for (int i=0; i<array.length; i+=1) {
        result += array[i] + ", ";
    }
    result += "]";

    return result;
}
  
public static void testEqualIntArrays (int[] result, int[] expected) {
  boolean equalArrays = true;

  if (result.length != expected.length) {
    equalArrays = false;
  } else {
    for (int i=0; i<result.length; i=i+1) {
      if (result[i] != expected[i]) {
        equalArrays = false;
      }
    }
  }

  if (!equalArrays) {
    System.out.println ("Error: the result " + arrayToString(result) +
                        " does not equal the expected " + arrayToString(expected));
  }
}

 public static void main (String[] args) {

  double[] numberList = {15, 32, 67, 44, 98};
  double[] emptyList = {};
  double[] singleList = {1};

  testEqualDoubles (Average.computeAverage (numberList), 51.2);
  testEqualDoubles (Average.computeAverage (emptyList), 0);
  testEqualDoubles (Average.computeAverage (singleList), 1);
}


}