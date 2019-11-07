package Chapter01;

import java.util.Scanner;

public class PrimeDetect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
		System.out.print("소수인지 판단할 숫자: ");

		//int divisor = 2;
		int num = stdin.nextInt();
		boolean isPrime = true;

		//while 
			//ㆍㆍㆍ
		
		if (isPrime) {
			System.out.println(num + "은 소수입니다.");
		} else {
			System.out.println(num + "은 소수가 아닙니다.");

		}

		stdin.close();
	}

}
