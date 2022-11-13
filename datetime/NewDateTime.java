package datetime;
 
import java.time.*;
import java.time.format.DateTimeFormatter;
 
public class NewDateTime {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub


        LocalDate d = LocalDate.now();
        System.out.println(d);

        LocalTime t = LocalTime.now();
        System.out.println(t);

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);


        System.out.println(dt.getDayOfMonth());
        System.out.println(dt.getHour());
        System.out.println(dt.getDayOfWeek().name());
        System.out.println(dt.getDayOfWeek().ordinal());

        DayOfWeek  day = dt.getDayOfWeek();
        System.out.println(day == DayOfWeek.WEDNESDAY);

        //Date to String in diff formats
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println(dt.format(df));

        System.out.println(dt.format(DateTimeFormatter.ISO_LOCAL_DATE));

        String bdate = dt.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(bdate);

        System.out.println(dt.format(DateTimeFormatter.ISO_LOCAL_TIME));

        System.out.println(dt.format(DateTimeFormatter.ofPattern("HH:mm:SS")));

 
    }
 
}