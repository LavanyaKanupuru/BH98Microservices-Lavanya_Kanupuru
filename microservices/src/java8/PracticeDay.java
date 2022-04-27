package java8;

import java.time.DayOfWeek;

public class PracticeDay {
	public static void main(String[] args) {
		
		DayOfWeek dayOfWeek= DayOfWeek.MONDAY;
	
		// Printing the day of the week
        // and its Int value
        System.out.println(dayOfWeek.name());
  
        int val = dayOfWeek.getValue();
  
        System.out.println("Int Value of "+ dayOfWeek.name() + " - " + val);
	}

}
