
/**
 * Write a description of class TestAverage here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestAverage extends TestFramework {        // <1>

  public void runTests () {                             // <2>

    double[] numbers = {15, 32, 67, 44, 98};
    double average = Average.computeAverage (numbers);

    testEqualDoubles (average, 51.2);                   // <3>
  }

  public static void main (String[] args) {
    TestAverage obj = new TestAverage ();               // <4>
    obj.runTests ();                                    // <5>
  }
}