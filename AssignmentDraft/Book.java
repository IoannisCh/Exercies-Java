
/**
 * Write a description of class c here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Book extends LoanItem
{
   private String author;
  
  public Book (String title, int id, boolean onLoan, String targetDate, String author) {
      super(title, id, onLoan, targetDate);
      this.author = author;
  }
  
  public String getAuthor (){
      return author;
  }
}