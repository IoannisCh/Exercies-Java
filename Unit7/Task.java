
/**
 * Write a description of class Task here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Task implements Comparable<Task>
{
    private LocalTime dueTime;
    private String description;
    
    public Task (LocalTime dueTime, String description){
        this.dueTime = dueTime;
        this.description = description;
    }
    
    public LocalTime getDueTime(){
        return dueTime;
    }
    
    public int compareTo (Task o) {
        return o.getDueTime().compareTo (dueTime);
    }
}
