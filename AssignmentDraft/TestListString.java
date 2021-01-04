public class TestListString 
{
    public class Cd extends LoanItem
{
  private String artist;
  
  public Cd (String title, int id, boolean onLoan, String targetDate, String artist) {
      super(title, id, onLoan, targetDate);
      this.artist = artist;
  }
  
  public String getArtist (){
      return artist;
  }
}
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
    public static void main (String[] args) 
    {
        List ls = new List ();
        
       
       
        
        System.out.println ("Full list: " + ls);
    }
}
