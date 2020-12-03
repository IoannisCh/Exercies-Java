
/**
 * Write a description of class Person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Person implements Comparable<Person>
{
    private String lastname;
    private String firstname;
    
    
    public Person (String firstname, String lastname){
        this.firstname = firstname;
        this.lastname = lastname;
    }
    
    public String getFirstname () {return firstname;}
    public String getLastname () {return lastname;}
    
    public int compareTo (Person o){
        if (lastname.equals (o.getLastname())){
            return firstname.compareTo (o.getFirstname());
        } else {
            return lastname.compareTo (o.getLastname());
        }
    }
    
    public static void main (){
        "Ioannis Chantolios".compareTo("George Papas");
        "Ioannis Chantolios".compareTo("Ioannis Chantolios");
        "Ioannis Chantolios".compareTo("George Chantolios");
    }
}
