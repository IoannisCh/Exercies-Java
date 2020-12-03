/**
 * Write a description of class TestMap here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.HashMap;
import java.util.Map;



public class TestMap
{
   public static void main (String[] args) {
       Map<String, Student> students = new HashMap<> ();
       students.put("ID1", new Student("Amanda", "001122"));
       students.put("ID1", new Student("Ramchandra", "002233"));
       students.put("ID1", new Student("Mondira", "003344"));
       
       System.out.println ("Studen with ID1 is " + students.get("ID1"));
       
       for (Student student : students.values ()){
           System.out.println (student);
       }
   }
   
  
}
