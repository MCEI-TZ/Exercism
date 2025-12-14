public class Lasagna {
    private final static int EXPECTED_MINUTES_IN_OVEN = 40;
    private final static int PREPARATION_TIME_IN_MINUTES = 2;
    
    public int expectedMinutesInOven(){
        return EXPECTED_MINUTES_IN_OVEN;
    }
    
    public int remainingMinutesInOven(int minuteOven){
        return expectedMinutesInOven() - minuteOven;
    }
    
    public int preparationTimeInMinutes(int layer){
        return layer * PREPARATION_TIME_IN_MINUTES;
    }
    
    public int totalTimeInMinutes(int layer, int minutes){
        return preparationTimeInMinutes(layer) + minutes;
    }
}
