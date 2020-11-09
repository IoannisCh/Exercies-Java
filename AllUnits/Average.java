
/**
 * Write a description of class Average here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Average {

  public static double findSum (double[] numbers) {
    double sum = 0;

    for (int i = 0; i < numbers.length; i = i + 1) {
      sum = sum + numbers[i];
    }

    return sum;
  }

  public static double computeAverage (double[] numbers) {
    if (numbers.length == 0) {
      return 0.0;
    } else {
      double sum = findSum (numbers);

      return sum/numbers.length;
    }
  }
  
  public static void showArray (int[] numbers) {
  System.out.print ("{");                           // <1>

  for (int i = 0; i < numbers.length; i = i + 1) {  // <2>
    System.out.print ("" + numbers[i] + ", ");      // <3>
  }

  System.out.println ("}");                         // <4>
}
  
public static int[] doubleArray (int[] numbers) {   // <1>
  int[] result = new int[numbers.length];           // <2>

  for (int i = 0; i < numbers.length; i = i+1) {
    result[i] = numbers[i] * 2;                     // <3>
  }

  return result;                                    // <4>
}

  public static void main (String[] args) {

    double[] numbers = {15, 32, 67, 44, 98};

    double average = computeAverage (numbers);

    System.out.println ("The average of the numbers is: " + average);
  }

}