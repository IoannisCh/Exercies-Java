public class planets extends observedItem
{
  private String name;
  
  public planets (String name, int id, boolean flag, String date) {
      super(name, id, flag, date);
      this.name = name;
  }
  
  public String getName (){
      return name;
  }  
}