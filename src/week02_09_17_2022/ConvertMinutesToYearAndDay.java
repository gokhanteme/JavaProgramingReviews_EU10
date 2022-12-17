package week02_09_17_2022;

import javax.lang.model.SourceVersion;

public class ConvertMinutesToYearAndDay {
    public static void main(String[] args) {
        int givenMinutes = 34567890;
        int howManyMinutesInAYear = (24 * 365 * 60);
        int year = givenMinutes / howManyMinutesInAYear;
        System.out.println("year = " + year);
        int remainderMinutes = givenMinutes % howManyMinutesInAYear;
        System.out.println("remainderMinutes = " + remainderMinutes);
        int days = remainderMinutes / (24 * 60);
        System.out.println("days = " + days);

        System.out.println(givenMinutes + " minutes is approximately " + year + " years and " + days + " days");

    }
}



/*

     Input the number of minutes: 3456789
     Expected Output :
     3456789 minutes is approximately 6 years and 210 days
 */