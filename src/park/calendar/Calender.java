package park.calendar;

import java.time.MonthDay;
import java.util.Scanner;

public class Calender {

	private final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public int maxDays(int month) {
		return MAX_DAYS[month - 1];
	}
	
	public void printMsg(int month, int day) {
		System.out.printf("%d월은 %d일까지 있습니다.", month, day);
	}
	
	public static void main(String[] args) {
		int month1;
		
		Scanner  scanner  = new Scanner(System.in);
		Calender calendar = new Calender();
		
		System.out.println("달을 입력하세요");
		
		month1 = scanner.nextInt();
		
		calendar.printMsg(month1, calendar.maxDays(month1));
		
		scanner.close();

	}

}
