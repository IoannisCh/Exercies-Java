public class Galaxy extends ObservedItem
{
  private String catalogue;
  
  public Galaxy (String name, int id, boolean flag, String date, String catalogue) {
      super(name, id, flag, date);
      this.catalogue = catalogue;
  }
  
  public String catalogue (){
      return catalogue;
  }
}