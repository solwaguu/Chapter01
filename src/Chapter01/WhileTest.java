package Chapter01;

public class WhileTest {

	public static void main(String[] args) {
		int n = 1; // 초기조건
		
		while(n < 11) {		 // 루프조건	
			System.out.println(n); // System.out.println(n++);
			n++;	// n = n + 1;, 조건변화 식 필요, 지정하지 않으면 무한loop
		}
		
		int m = 0;
		
		while(m < 10) {
			m++;
			System.out.println(m);
		}

	}

}
