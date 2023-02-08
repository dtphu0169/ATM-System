package Model;

import java.util.Calendar;

public class Date {
	private String year;
	private String month;
	private String day;
	private String hour;
	private String minute;
	private String second;
	public Date(String day, String month, String year, String hour, String minute, String second) {
		this.year = year;
		this.month = month;
		this.day = day;
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	public Date(String year, String month, String day) {
		this.year = year;
		this.month = month;
		this.day = day;
		this.hour ="0";
		this.minute ="0";
		this.second ="0";
	}

	public String getYear() {
		return year;
	}
	public String getMonth() {
		return month;
	}
	public String getDay() {
		return day;
	}
	public String getHour() {
		return hour;
	}
	public String getMinute() {
		return minute;
	}
	public String getSecond() {
		return second;
	}

	public String getDMY() {
		return day+"/"+month+"/"+year;
	}
	public String toString() {
		return day+"/"+month+"/"+year+"/"+hour+"/"+minute+"/"+second;
	}
	public static Date getCurrentTime() {
		Calendar cal = Calendar.getInstance();
		String day = cal.get(Calendar.DAY_OF_MONTH)+"";
		String month = cal.get(Calendar.MONTH)+"";
		String year = cal.get(Calendar.YEAR)+"";
		String hour = cal.get(Calendar.HOUR_OF_DAY)+"";
		String minute = cal.get(Calendar.MINUTE)+"";
		String second = cal.get(Calendar.SECOND)+"";
		return new Date(day, month, year, hour, minute, second);
	}
}
