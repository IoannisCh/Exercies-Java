public class observedItem
{
  private String name;
  private int id; //Club Reference Number
  private boolean flag;
  private String date;
  private String type; //Kind of observed item
  
  public observedItem (String name, int id, boolean flag, String dateate, String type){
      this.name = name;
      this.id = id;
      this.flag = flag;
      this.date = date;
      this.type = type;
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
  
  public String getType() {
      return type;
  }
}
