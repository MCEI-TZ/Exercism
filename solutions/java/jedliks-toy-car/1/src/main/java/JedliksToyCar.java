public class JedliksToyCar {
    public int battery = 100;
    public int meters;
    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return "Driven "+meters+" meters";
    }

    public String batteryDisplay() {
        String batteryDisplay = battery != 0 ? "Battery at "+battery+"%": "Battery empty";
        return batteryDisplay;
    }

    public void drive() {
        if(battery != 0){
            meters += 20;
            battery -= 1;
        }
    }
}