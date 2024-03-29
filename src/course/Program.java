package course;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Program {
	
	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
		Date d = Date.from(Instant.parse("2019-07-15T15:42:07Z"));
		
		System.out.println("Bom dia!");
		
		System.out.println(sdf.format(d));
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.HOUR_OF_DAY, 4);
		d = cal.getTime();
		
		System.out.println(sdf.format(d));
		
		int minutes = cal.get(Calendar.MINUTE);
		
		System.out.println("Minutos: " + minutes);
	}

}
