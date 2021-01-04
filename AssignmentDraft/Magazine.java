
/**
 * Write a description of class d here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Magazine extends LoanItem
{
  private String publisher;
  
  public Magazine (String title, int id, boolean onLoan, String targetDate, String publisher) {
      super(title, id, onLoan, targetDate);
      this.publisher = publisher;
  }
  
  public String getPublisher (){
      return publisher;
  }
}