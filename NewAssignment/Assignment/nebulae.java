public class nebulae extends observedItem
{
  private String name;
  
  public nebulae (String name, int id, boolean flag, String date) {
      super(name, id, flag, date);
      this.name = name;
  }
  
  public String getName (){
      return name;
  }
}