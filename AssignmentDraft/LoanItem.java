public class LoanItem
{
  private String title;
  private int id;
  private boolean onLoan;
  private String targetDate;
  private String type;
  
  public LoanItem (String title, int id, boolean onLoan, String targetDate, String type){
      this.title = title;
      this.id = id;
      this.onLoan = onLoan;
      this.targetDate = targetDate;
      this.type = type;
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
  
  public String getType() {
      return type;
  }
}
