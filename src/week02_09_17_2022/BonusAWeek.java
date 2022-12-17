package week02_09_17_2022;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class BonusAWeek {
    public static void main(String[] args) {

        LocalTime today= LocalTime.now();

        int hour= today.getHour();
        int minutes= today.getMinute();
        int second= today.getSecond();

        System.out.println("This moment is " + hour +" "+"hours " +minutes
                +" " +"minutes "+second +" "+"seconds.");

    }
}
