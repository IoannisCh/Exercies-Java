public class galaxies extends observedItem
{
  private String name;
  
  public galaxies (String name, int id, boolean flag, String date) {
      super(name, id, flag, date);
      this.name = name;
  }
  
  public String name (){
      return name;
  }
}