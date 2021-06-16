public class galaxies extends observedItem
{
  private String catalogue;
  
  public galaxies (String name, int id, boolean flag, String date, String catalogue) {
      super(name, id, flag, date);
      this.catalogue = catalogue;
  }
  
  public String catalogue (){
      return catalogue;
  }
}