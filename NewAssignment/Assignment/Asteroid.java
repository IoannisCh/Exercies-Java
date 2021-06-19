public class Asteroid extends ObservedItem
{
  private String brightness;
  
  public Asteroid (String name, int id, boolean flag, String date, String brightness) {
      super(name, id, flag, date);
      this.brightness = brightness;
  }
  
  public String brightness (){
      return brightness;
  }
}