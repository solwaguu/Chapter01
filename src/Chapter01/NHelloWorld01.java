package Chapter01;

import java.util.Scanner;

public class NHelloWorld01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); //import, ctrl+shift+"o"
		
		int number = scanner.nextInt(); // 사용자 입력까지 blocking
			//System.out.println(number); // 숫자가 받아졌나 확인
		
		int i = 0;
		
		while(i < number) {
			System.out.println("Hello World");
			i++;
		}
			
		scanner.close(); //Scanner사용정지를 꼭 알려야함
	}

}
