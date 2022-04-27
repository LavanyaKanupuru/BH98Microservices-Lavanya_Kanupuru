package java8;

import java.time.*;
import java.time.DayOfWeek;
  
class DayOfWeekExample {
    public static void main(String[] args)
    {
        
        LocalDate localDate= LocalDate.of(1998, Month.AUGUST, 10);
   
        DayOfWeek dayOfWeek= DayOfWeek.from(localDate);
  
        System.out.println("Day of the Week on"+" "+ localDate+" - "+ dayOfWeek.name());
  
        int val = dayOfWeek.getValue();
  
        System.out.println("Int Value of "+ dayOfWeek.name() + " - " + val);
    }
}
