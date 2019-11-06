package Chapter01;

public class Arith {

	public static void main(String[] args) {
		/*
		 *  산술연산자 (= 이항연산자)
		 */
		int a = 3;
		int b = 7;
		
		int r1 = a + b;
		System.out.println(r1);
		
		int r2 = a - b;
		System.out.println(r2);
		
		int r3 = a * b;
		System.out.println(r3);
		
		int r4 = a / b; // 정수로 사칙연산은 정수만 나옴 = 몫만 나옴
		System.out.println(r4);
		
		int r5 = a % b;
		System.out.println(r5); // 나머지만 나옴
		
		// int op int => int 
		System.out.println(10 / 3); // 3.3333... -> 3
		// int op double => double
		System.out.println(10 / 3.);
		// 주의
		System.out.println((double)10 / 3); //10이 casting된 상태 = double / double = double
		System.out.println((double)(10 / 3)); //괄호 속 연산이 우선, 계산 후 double로 casting
		
		/*
		 *  증감연산자(= 단항연산자)
		 *  ++, --
		 */
		// 후위
		int n = 1;
		n++;	// n = n + 1;
		System.out.println(n);
		
		n--; // n = n - 1;
		System.out.println(n);
		
		// 전위
		++n;
		System.out.println(n);
		
		System.out.println("증감연산자(전위/후위) 테스트");
			int nn = 1;
			System.out.println(nn++); // 연산되지 않은 nn값을 출력함
			System.out.println(nn);	  // 앞의 과정 후에 값이 증가되어있음
			
			int aa = 5;
			System.out.println(--aa); // 연산을 진행하고 출력해
			System.out.println(aa);
		System.out.println("증감연산자(전위/후위) 테스트 끝 ----");
		
		/*
		 *  참고 (산술 연산자는 다음과 같이 축양형을 쓸 수 있다.
		 */
		n += 10; // n = n + 10
		System.out.println(n);
		
		n -= 10; // n = n - 10
		System.out.println(n);
		
		n *= 10; // n = n * 10
		System.out.println(n);
	}

}
