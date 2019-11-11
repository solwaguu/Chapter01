package Chapter01;

import java.util.Scanner;

public class PrimeDetect {

	public static void main(String[] args) {
		// scanner : 데이터를 받아와서 num에 저장
		Scanner stdin = new Scanner(System.in);
		System.out.print("소수인지 판단할 숫자: ");

		int divisor = 2;
		int num = stdin.nextInt();
		boolean isPrime = true;

		while(divisor < num) {
			if(num % divisor == 0) {
				isPrime = false;
				divisor++;
			} else {
				divisor++;
			}
		}
		
		if (isPrime) {
			System.out.println(num + "은 소수입니다.");
		} else {
			System.out.println(num + "은 소수가 아닙니다.");
		}

		stdin.close();
	}

}
