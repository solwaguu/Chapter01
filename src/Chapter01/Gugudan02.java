package Chapter01;

public class Gugudan02 {

	public static void main(String[] args) {
		// for문 2개를 사용한 구구단을 출력하시오
		int j = 1;
		
		for(int i = 2; i < 10; i++) {
			for( j = 1 ; j < 10; j++) {
				int result = i * j;
				System.out.println(i + " * " + j + " = " + result);
			}
		}

	}

}
