public class galaxies extends observedItem
{
  private String name;
  
  public galaxies (String name, int id, boolean flag, String date, String type) {
      super(name, id, flag, date, type);
      this.name = name;
  }
  
  public String name (){
      return name;
  }
}