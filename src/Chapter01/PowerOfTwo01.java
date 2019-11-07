package Chapter01;

import java.util.Scanner;

public class PowerOfTwo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("승수 : ");
		
		int power = scanner.nextInt();
		
		long result = 1; //곱셈은 1부터 시작해야함
		int i = 0;
		
		while(i < power) {
			result = result * 2;
			//System.out.println(result);
			i++;
		}
		System.out.println("2의 " + power + "승은 " + result + "입니다.");
		scanner.close();
	}

}
