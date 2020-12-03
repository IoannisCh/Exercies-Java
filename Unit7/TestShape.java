
/**
 * Write a description of class TestShape here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestShape
{
   public static void main (String[] args){
       Shape s = new Shape ("Blue");
       Circle c = new Circle ("Red", 5);
       
       System.out.println ("Shape: " + s.toString());
       System.out.println ("Circle: " + c.toString());
       
       Circle c2 = new Circle ("Red", 5);
       System.out.println ("Equal?" + c.equals(c2));
   }
}
