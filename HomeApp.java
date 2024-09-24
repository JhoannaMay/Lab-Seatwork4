public class HomeApp {
    public static void main(String[] args) {
        HomeInterface facade = new HomeInterface();

        // Turn on all services
        facade.turnOnAll();

        // Turn off all services
        facade.turnOffAll();
    }
}