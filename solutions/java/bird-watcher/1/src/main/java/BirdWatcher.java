
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        int[] copyLastWeek = {0, 2, 5, 3, 7, 8, 4};
        return copyLastWeek;
    }

    public int getToday() {
        int todayBirds = birdsPerDay[birdsPerDay.length -1];
        return todayBirds;
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length -1] += 1;
    }

    public boolean hasDayWithoutBirds() {
        for(int bird : birdsPerDay){
            if(bird == 0) return true;
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int count = 0;
        if(numberOfDays > 7) numberOfDays = 7;
            for(int i = 0; i < numberOfDays; i++ ){
            count += birdsPerDay[i];
            }   
        return count;
    }

    public int getBusyDays() {
        int count = 0;
        for(int bird : birdsPerDay ){
            if(bird >= 5) ++count;
        }
        return count;
    }
}
