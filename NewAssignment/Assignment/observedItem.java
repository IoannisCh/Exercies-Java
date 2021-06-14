public class observedItem
{
  private String name;
  private int id; //Club Reference Number
  private boolean flag;
  private String date;
  
  
  public observedItem (String name, int id, boolean flag, String date){
      this.name = name;
      this.id = id;
      this.flag = flag;
      this.date = date;
  }
  
  public String getName () {
      return name;
  }
  
  public int getId () {
      return id;
  }
  
  public boolean Flag (){
      return flag;
  }
  
  public String getDate () {
      return date;
  }
}
