package Chapter01;

public class IfTest {

	public static void main(String[] args) {
		int a = 10;
		int b = 15;
		
		
		// 두 수(a,b)의 차이 값은?
		int diff = 0; // 블락 안에서만 diff가 선언되었다면 프린트 할 수 없음
		
		if(a > b) {
			diff = a - b;
		} else {
			diff = b - a;
		}
		
		System.out.println(diff);
	}

}
