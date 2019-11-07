package Chapter01;

import java.util.Scanner;

public class SumInput01 {

	public static void main(String[] args) {
		// 사용자가 입력한 수만큼 더하기
		
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
		int sum = 0;
		int i = 0;
		
		while(i < number) {
			i++;
			sum = sum + i;
		}
		System.out.println(number + "까지 합은 " + sum + "입니다.");
		
		scanner.close();
	}

}
