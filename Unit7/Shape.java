
/**
 * Write a description of class Shape here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Shape
{
    private String colour;
    
    public Shape (String colour) {
        this.colour = colour;
    }
    
    public String getColour () {
        return colour;
    }
    
    public String toString(){
        return "Colour is " + colour;
    }
}
