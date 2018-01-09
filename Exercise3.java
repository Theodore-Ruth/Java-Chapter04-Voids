
public class Exercise3 {

	public static void printAmerican(String day, int date, String month, int year) {
		System.out.println(day + ", " + month + " " + date + ", " + year);
	}
	
	public static void printEuropean(String day, int date, String month, int year) {
		System.out.println(day + ", " + date + " " + month + ", " + year);
	}
	
	public static void main(String[] args) {
		String day = "Tuesday";
		int date = 9;
		String month = "January";
		int year = 2018;
		printAmerican(day, date, month, year);
		printEuropean(day, date, month, year);
	}

}
