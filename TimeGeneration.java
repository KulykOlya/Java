package timeGeneration;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TimeGeneration {
	
	static String time;
	
	public static String currentTime(){
		Calendar calendar = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        time = sdf.format(calendar.getTime());
		return time;}    
}