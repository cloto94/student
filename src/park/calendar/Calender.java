package park.calendar;

import java.util.Scanner;

public class Calender {

	private final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	
	public int maxDays(int month) {
		return MAX_DAYS[month - 1];
	}

	public void printMsg(int month, int day) {
		System.out.printf("%d월은 %d일까지 있습니다.\n", month, day);
	}

	public static void main(String[] args) {
		int month1 = 0;
		String PROMPT = "cal> ";
		
		Scanner scanner = new Scanner(System.in);
		Calender calendar = new Calender();

		System.out.println("반복 횟수를 입력하세요.");
		System.out.print(PROMPT);		
		
		int repeat = scanner.nextInt();

		while (true) {
		
		    System.out.println("달을 입력하세요.");
	        System.out.print(PROMPT);
	        month1 = scanner.nextInt();		

		    if (month1 > 0 && month1 < 13) {
		        calendar.printMsg(month1, calendar.maxDays(month1));
		    }
		    else if(month1 > 12) {
		    	continue;
		    }		    
		    else
		    {
		    	break;
		    }
		}
		
		
		System.out.println(">> Bye");
		scanner.close();

	}

}
