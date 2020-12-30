
/**
 * Write a description of class LoanItem here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LoanItem
{
  private String title;
  private int id;
  private boolean onLoan;
  private String targetDate;
  
  public LoanItem (String title, int id, boolean onLoan, String targetDate){
      this.title = title;
      this.id = id;
      this.onLoan = onLoan;
      this.targetDate = targetDate;
  }
  
  public String getTitle () {
      return title;
  }
  
  public int getId () {
      return id;
  }
  
  public boolean getOnLoan (){
      return onLoan;
  }
  
  public String getTargetDate () {
      return targetDate;
  }
  
}
