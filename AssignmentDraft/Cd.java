public class Cd extends LoanItem
{
  private String artist;
  
  public Cd (String title, int id, boolean onLoan, String targetDate, String artist, String type) {
      super(title, id, onLoan, targetDate, type);
      this.artist = artist;
  }
  
  public String getArtist (){
      return artist;
  }
}