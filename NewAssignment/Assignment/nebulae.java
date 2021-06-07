public class nebulae extends observedItem
{
  private String name;
  
  public nebulae (String name, int id, boolean flag, String date, String type) {
      super(name, id, flag, date, type);
      this.name = name;
  }
  
  public String getName (){
      return name;
  }
}