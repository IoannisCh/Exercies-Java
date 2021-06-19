public class ObservedItem
{
  private String name;//
  private int id; //Club Reference Number
  private boolean flag; //
  private String date;
  
  
  public ObservedItem (String name, int id, boolean flag, String date){
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
  
  public boolean getFlag (){
      return flag;
  }
  
  public String getDate () {
      return date;
  }
}
