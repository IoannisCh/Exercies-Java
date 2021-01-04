
/**
 * Write a description of class b here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dvd extends LoanItem
{
    private String publisher;
  
  public Dvd (String title, int id, boolean onLoan, String targetDate, String publisher) {
      super(title, id, onLoan, targetDate);
      this.publisher = publisher;
  }
  
  public String getPublisher (){
      return publisher;
  }  
}