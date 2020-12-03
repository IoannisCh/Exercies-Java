
/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
       public Student (String name, String telephone){
           this.name = name;
           this.telephone = telephone;
       }
       
       public String toString() {
           return "Student " + name + "(" + telephone + ")";
       }
       
       private String name;
       private String telephone;
}
