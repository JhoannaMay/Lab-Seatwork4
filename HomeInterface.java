public class HomeInterface {
   private HomeService tv;
   private HomeService light;
   private HomeService airconditioning;

   public HomeInterface() {
    this.tv = new TV();
    this.light = new Light();
    this.airconditioning= new AirConditioning();
   }
   public void turnOnAll(){
    light.turnOn();
    tv.turnOn();
    airconditioning.turnOn();
    System.out.println("All services are turned ON");
   }
   public void turnOffAll(){
    light.turnOff();
    tv.turnOff();
    airconditioning.turnOff();
    System.out.println("All services are turned Off");
   }

}
