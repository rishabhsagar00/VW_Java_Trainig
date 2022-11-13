package datetime;
 
import java.time.*;
import java.time.format.DateTimeFormatter;
 
public class DateTimeEx {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub


        LocalDate d = LocalDate.now();
        System.out.println(d);

         //model/create Date as per your values
          d = LocalDate.of(2000,12,5);
          System.out.println(d);


          //plus and minus methods to add and substract date,month or year portions to date
          System.out.println(d.plusYears(1));
          System.out.println(d.minusMonths(1));



        LocalTime t = LocalTime.now();
        System.out.println(t);

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        //create DateTime as per your values
        dt = LocalDateTime.of(2000,12,5,11,30,30);
        System.out.println(dt);

        System.out.println(dt.getDayOfMonth());
        System.out.println(dt.getHour());
        System.out.println(dt.getDayOfWeek().name());
        System.out.println(dt.getDayOfWeek().ordinal());

        DayOfWeek  day = dt.getDayOfWeek();
        System.out.println(day == DayOfWeek.WEDNESDAY);

        //Date to String in diff formats
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String strdate = dt.format(df);
        System.out.println(strdate);

        System.out.println(dt.format(DateTimeFormatter.ISO_LOCAL_DATE));

        String bdate = dt.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(bdate);

        System.out.println(dt.format(DateTimeFormatter.ISO_LOCAL_TIME));

        System.out.println(dt.format(DateTimeFormatter.ofPattern("HH:mm:SS")));

        //strdate (date in string format) into LocalDate,LocalDateTime


         //String to Date , String to DateTime
        System.out.println("Convert a Date in iso-standard format to String for that pattern not needed:");
        LocalDate dt1 = LocalDate.parse("2022-11-09");

        System.out.println("after converting to date:"+dt1);

        System.out.println("Date in non-iso-standard string format is:"+strdate);
        DateTimeFormatter patt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(LocalDate.parse(strdate,patt));

        String strdtime = "11/09/2022 03:10";
        System.out.println("DateTime in non-iso-standard string format is:"+strdtime);
        patt = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm");
        System.out.println(LocalDateTime.parse(strdtime,patt));
        // LocalDateTime ob = LocalDateTime.parse(strdtime,patt);


        //isBefore method can be used on LocalDate,LocalDateTime and LocalTime all 3
          LocalDateTime date11 = LocalDateTime.now();
               System.out.println("date1:"+date11);
            LocalDateTime date21 =
                LocalDateTime.of(2022, Month.NOVEMBER,20,16,11,0);
            System.out.println("date2:"+date21);
 
            //find out which date time is smaller and which one is greater
            System.out.println("date1 comes before date2:"+date11.isBefore(date21));



         checkingPeriod();    

         checkingDuration();
 
    }


    // Java code for period and duration
    /*
     * Period and Duration classes : 
       Period : It deals with date based amount of time. 
       Duration : It deals with time based amount of time.
     */
         public static void checkingPeriod()
        {
            LocalDate date1 = LocalDate.now();

            LocalDate date2 =
                LocalDate.of(2022, Month.NOVEMBER, 5);

            Period gap = Period.between(date2, date1);
            System.out.println("gap in days between two dates "+
                               "is a period of "+gap.getDays());

             date2 =
                    LocalDate.of(2022, Month.DECEMBER, 9);

                gap = Period.between(date1, date2);
                System.out.println("gap in days between two dates "+
                                   "is a period of "+gap.getDays());


                System.out.println("gap in month between two dates "+
                        "is a period of "+gap.getMonths());


                //check if two dates are equal

                LocalDate date11 = LocalDate.now();
                   System.out.println("date1:"+date11);
                LocalDate date21 =
                    LocalDate.of(2022, Month.NOVEMBER, 9);
                System.out.println("date2:"+date21);
 
                
                System.out.println("check if two dates are equal:"+Period.between(date11, date21).isZero());



                //find out which date time is smaller and which one is greater
                System.out.println(date11.isBefore(date21));


        }

          // Function to check duration between two Times
        public static void checkingDuration()
        { 

            LocalTime time1 = LocalTime.now();
            System.out.println("the current time is " +
                                time1);

            Duration fiveHours = Duration.ofHours(5);

            // adding five hours to the current
            // time and storing it in time2
            LocalTime time2 = time1.plus(fiveHours);

            System.out.println("after adding five hours " +
                               "of duration " + time2);

            Duration gap = Duration.between(time2, time1);
            System.out.println("duration gap between time1" +
                               " & time2 is " + gap);

            System.out.println("if two durations (Times portion) are same " + gap.isZero());
    }
 
}

