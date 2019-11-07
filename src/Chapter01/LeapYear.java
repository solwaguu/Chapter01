package Chapter01;

public class LeapYear {

	public static void main(String[] args) {
		/*
		 *  윤년 : 2월이 29일까지인 달 - 조건알고리즘이 안맞음
		 *  1) 4로 나누어서 나머지가 0이 아닌 해는 윤년이 아니다. 
		 *  2) 4로 나누어서 나머지가 0인 해 중에 100으로 나누어서 나머지가 0이 아닌 해는 윤년이다.
		 *  3) 2번의 결과 0인 해중에 400으로 나누어서 나머지가 0인 해는 윤년이다.
		 *  4) 3번의 결과 0이 아닌 해는 윤년이 아니다.
		 */
		
		int year = 2016;		
		
		if(year % 4 != 0) {
			System.out.println("윤년이 아닙니다.");
		} else if(year % 100 != 0) {
			System.out.println("윤년 입니다.");
		} else if(year % 400 == 0) {
			System.out.println("윤년입니다.");
		} else {
			System.out.println("윤년이 아닙니다.");
		}

		System.out.println("---------------------------------");
		
		if(year % 4 != 0) {
			System.out.println("윤년이 아닙니다");
		} else {
			if(year % 100 != 0) {
				System.out.println("윤년 입니다.");
			} else {
				if(year % 400 == 0) {
					System.out.println("윤년입니다.");
				} else {
					System.out.println("윤년이 아닙니다.");
				}
			}
		}
		
	}

}
