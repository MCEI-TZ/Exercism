//import java.time.Year;

class Leap {

    boolean isLeapYear(int year) {
//        return Year.isLeap(year);
        return year % 100 == 0 ? year % 400 == 0 : year % 4 == 0;
//        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }

}
