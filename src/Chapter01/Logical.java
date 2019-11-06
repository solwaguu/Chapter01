package Chapter01;

public class Logical {
	
	public static void main(String[] args) {
		// 논리 연산자는 이항연산자인데 각 항이 True/False의 변수나 연산이어야 함
		int a = 7;
		int b = 3;
		
		// OR(||) 둘 중 하나가 True(1)면 True = 논리합( 1 + 0 = 1 ), cf) false(0)
		//  true || false => true
		//  true || true => true
		// false || true => true
		// false || false => false
		boolean r1 = (a > b) || (b != a);
		System.out.println(r1);

		boolean r2 = (a > b) && (b != a);
		System.out.println(r2);

		// AND(&&) 둘 다(all) True(1)면 True = 논리곱( 1 * 0 = 0 ), cf) false(0)
		//  true && false => fasle
		//  true && true => true
		// false && true => false
		// false && false => false
		System.out.println(a == b || a > b);
		System.out.println(a == b && a > b);
		
		System.out.println(a != b || a > b);
		System.out.println(a != b && a > b);
		
		// NOT(!) : 단항연산자, 연산 결과의 반대
		System.out.println(!(a > b)); // (a>b) = true, 의 반대라 결과는 false
		
	}

}
