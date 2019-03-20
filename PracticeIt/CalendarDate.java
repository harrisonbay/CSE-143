/* You have been asked to extend the Date class that represents calendar 
dates such as March 19th. The Date class includes these constructors and 
methods: ... */ 

public class CalendarDate extends Date implements Comparable<CalendarDate> {
	
	private int year;
	
	public CalendarDate(int year, int month, int day) {
		super(month, day);
		this.year = year;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	@Override
	public String toString() {
		return year + "/" + super.toString();
	}
	
	@Override
	public void nextDay() {
		super.nextDay();
		if (getMonth() == 1 && getDay() == 1) {
			year++;
		}
	}
	
	@Override
	public int compareTo(CalendarDate other) {
		if (year != other.year) {
			return year - other.year;
		} else if (getMonth() != other.getMonth()) {
			return getMonth() - other.getMonth();
		} else {
			return getDay() - other.getDay();
		}
	}
}