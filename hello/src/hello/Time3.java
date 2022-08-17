package hello;
import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Time3 {

	public static void main(String[] args) throws Exception {
		Date now = new Date();
		
		Calendar c = Calendar.getInstance();
		c.setTime(now);
		int day = c.get(Calendar.DAY_OF_MONTH);
		day += 100;
		c.set(Calendar.DAY_OF_MONTH, day);
		Date d = c.getTime();
		
		SimpleDateFormat f = new SimpleDateFormat("¼—ïyyyy”NMMŒdd“ú");
		System.out.println(f.format(now));
		System.out.println(f.format(d));
		
		//TimeAPI
		LocalDate present = LocalDate.now();
		LocalDate after = present.plusDays(100);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("¼—ïyyyy”NMMŒdd“ú");
		System.out.println(present.format(fmt));
		System.out.println(after.format(fmt));
		
		// TODO Auto-generated method stub

	}

}
