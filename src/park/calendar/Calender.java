package park.calendar;

import java.time.MonthDay;
import java.util.Scanner;

public class Calender {

	public static void main(String[] args) {
		int month1;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("달을 입력하세요");
	
		String sMonth;
		
		month1 = scanner.nextInt();
		
		int[] day1 = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		
		System.out.printf("%d월은 %d일까지 있습니다.", month1, day1[month1 - 1]);
		
		
		scanner.close();

	}

}
