package Chapter01;

import java.util.Scanner;

public class Prob1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Scanner의 존재를 모름
		int number = scanner.nextInt(); // 키보드 입력으 받아옴
		
		int result = number % 3;
		
		if(result == 0) {
			System.out.println(number);
			System.out.println("3의 배수입니다.");
		} else {
			System.out.println(number);
			System.out.println("3의 배수가 아닙니다.");
		}
		
	}

}
