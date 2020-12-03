
/**
 * Write a description of class Circle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Circle extends Shape 
{
    private int radius;
    
    public Circle (String colour, int radius) {
        super (colour);
        this.radius = radius;
    }
    
    public int getRadius () {
        return radius;
    }
    
    public String toString(){
        return "Radius is " + radius + ", " + super.toString();
    }
}
