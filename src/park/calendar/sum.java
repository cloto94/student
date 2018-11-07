package park.calendar;

import java.util.Scanner;

public class sum {

	public static void main(String[] args) {
		// 입력은 키보드로 출력은 콘솔에 출력
		int a, b;
		String s1, s2;
		
		Scanner scanner = new Scanner(System.in);
				
		System.out.println("두 수를 입력하세요.");
		
		s1 = scanner.next();
		s2 = scanner.next();
		
		a = Integer.parseInt(s1);
		b = Integer.parseInt(s2);
		
		System.out.printf("%d + %d = %d", a, b, a + b);
		
		scanner.close();
	}

}
