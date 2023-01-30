package DateAndTime;

import java.time.LocalDateTime;

public class DateAndTime {

    public static void main(String[] args) {
        

        LocalDateTime dateAndTime = LocalDateTime.now();
        System.out.println("The Current date and time is: " + dateAndTime);
        System.out.println(dateAndTime.now().getMonth() + " " + dateAndTime.now().getDayOfMonth() + " " + dateAndTime.now().getYear());
        


    }
    
}
