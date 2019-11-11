package Chapter01;

import java.util.Scanner;

public class SumToInput {

	public static void main(String[] args) {
		// 1에서부터 입력된 n까지의 합
		Scanner scanner = new Scanner(System.in);
		System.out.print("n값을 입력하세요 : ");
		int n = scanner.nextInt();
		int sum = 0;
		int i = 0;
		
		while(i <= n) {
			i++;
			sum = sum + i;
		}
		System.out.println(sum);
		
		scanner.close();
		
	}

}
