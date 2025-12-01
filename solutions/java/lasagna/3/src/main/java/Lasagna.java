public class Lasagna {
    
    public int expectedMinutesInOven(){
        return 40;
    }
    
    public int remainingMinutesInOven(int minuteOven){
        return expectedMinutesInOven() - minuteOven;
    }
    
    public int preparationTimeInMinutes(int layer){
        return layer * 2;
    }
    
    public int totalTimeInMinutes(int layer, int minutes){
        return preparationTimeInMinutes(layer) + minutes;
    }
}
