package Chapter01;

import java.util.Scanner;

public class PowerOfTwo02 {

	public static void main(String[] args) {
		// 2의 입력값(n) 만큼의 제곱근을 구하여라
		Scanner scanner = new Scanner(System.in);
		System.out.print("제곱할 값을 입력 : ");
		
		int n = scanner.nextInt();
		int i = 0;
		int result = 1;
		
		while(i < n) {
			i++;
			result = result * 2;
			System.out.println("진행중인 결과값 : " + result);
		}
		System.out.println("최종결과 값 : " + result);
		
		scanner.close();
	}

}
