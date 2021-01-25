public class Magazine extends LoanItem
{
  private String publisher;
  
  public Magazine (String title, int id, boolean onLoan, String targetDate, String publisher, String type) {
      super(title, id, onLoan, targetDate, type);
      this.publisher = publisher;
  }
  
  public String getPublisher (){
      return publisher;
  }
}