public class Excercise 3 {

	public static void printAmerican(String day, int date, String month, int year) {
		System.out.print(day , ", ");
		System.out.print(month , " ");
		System.out.print(date , ", ");
		System.out.println(year);
	}
	
	public static void printEuropean(String day, String month, int date, int year) {
		System.out.print(day , ", ");
		System.out.print(date , " ");
		System.out.print(month , ", ");
		System.out.println(year);
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