
/**
 * Write a description of class findNumber here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class findNumber
{
   public static int findNumber (int[] numbers, int toFind){
       for (int i = 0; i<numbers.length; i += 1){
           if (toFind == numbers[i]){
               return i;
           }
       }
       return -1;
   }
   
   

    public static void bubbleSort (int[] numbers) {
        boolean madeSwap;                                     // <1>

        do {                                                  // <2>
            madeSwap = false;                                   // <3>
            for (int i = 0; i < numbers.length-1; i = i + 1) {  // <4>
                if (numbers[i] > numbers[i+1]) {                  // <5>
                    swap (numbers, i, i+1);                         // <6>
                    madeSwap = true;                                // <7>
                }
            }
        } while (madeSwap);                                 // <8>
    }
   
   public static int numberOfSwaps;
   
   public static void swap (int[] numbers, int i1, int i2){
       int temp;
       
       temp = numbers[i1];
       numbers[i1] = numbers[i2];
       numbers[i2] = temp;
       
       numberOfSwaps += 1;
   }
   
   public static void measureBubbleSort (int[] numbers){
       numberOfSwaps = 0;
       bubbleSort (numbers);
       System.out.println ("Number of swaps for array length " + numbers.length + " is " + numberOfSwaps);
   }
   
   
}
