
/**
 * Write a description of class Average here.
 *
 * @author IoannisCh
 * @version 1.0
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

  public static void main (String[] args) {

    double[] numbers = {15, 32, 67, 44, 98};

    double average = computeAverage (numbers);

    System.out.println ("The average of the numbers is: " + average);
  }

}