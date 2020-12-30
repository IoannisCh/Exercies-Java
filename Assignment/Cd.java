
/**
 * Write a description of class Cd here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
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
