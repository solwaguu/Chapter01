package Chapter01;

public class Gugudan {

	public static void main(String[] args) {
		/*
		 * < 형식화된 출력 printf("출력서식", 출력할내용); >
		 * 출력 후 줄바꿈을 하지 않는다. 줄바꿈을 하려면 지시자 '%n'을 넣어줘야 한다.
		 * 출력하려는 값의 수만큼 지시자도 사용해야 한다.
		 * 출력될 값과 지시자의 순서는 일치해야 한다.
		 * 지시자를 제외한 문자는 입력한 그대로 출력된다.
		 * 
		 * < 출력서식 >
		 * %[-][0][n][.m]지시자
		 * n : 출력할 전체 자리수 지정(오른쪽 정렬).  예) %3d, 전체자리수가 3인 정수
		 * 0 : 전체 자리수가 지정된 경우 왼쪽의 남는 자리에 0을 출력.  예) %03d
		 * - : 전체 자리수가 지정된 경우 왼쪽 정렬하고 빈칸에 공백 출력.
		 * .m : 소수점 아래 자리수 지정. 잘리는 소수점 자리수는 반올림 시켜서 표시.  예)3.2f
		 * 
		 * < escape sequence >
		 * \t : Horizontal tab : 수평 탭 문자
		 * \v : Vertical tab   : 수직 탭 문자
		 * 
		 */
		// 문제 : 가로로 출력하는 구구단, 각 단의 간격을 일정하게, 숫자출력 형식화 %2d
		
		int result = 0;
		
		for(int j = 1; j < 10; j++) {
			for(int i = 2; i < 10; i++) {
				result = i * j;
				System.out.printf("%2d * %2d = %-2d \t", i, j, result);
			}
			System.out.printf("%n");
		}
		
		
	}

}
