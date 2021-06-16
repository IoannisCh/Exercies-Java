public class asteroids extends observedItem
{
  private String brightness;
  
  public asteroids (String name, int id, boolean flag, String date, String brightness) {
      super(name, id, flag, date);
      this.brightness = brightness;
  }
  
  public String brightness (){
      return brightness;
  }
}