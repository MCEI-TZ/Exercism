class NeedForSpeed {
    private int speed;
    private int batteryDrain;
    private int battery = 100;
    private int distance = 0;
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public int getBattery(){
        return this.battery;
    }

    public int getBatteryDrain(){
        return this.batteryDrain;
    }

    public int getSpeed(){
        return this.speed;
    }
    public boolean batteryDrained() {
        return battery < batteryDrain;
    }

    public int distanceDriven() {
        return this.distance;
    }

    public void drive() {
        if(battery >= batteryDrain){
            distance += speed;
            battery -= batteryDrain;
        };
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50,4);
    }
}

class RaceTrack {
    private int distance;
    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        return ((car.getBattery()/car.getBatteryDrain())*car.getSpeed())>=distance;
    }
}
