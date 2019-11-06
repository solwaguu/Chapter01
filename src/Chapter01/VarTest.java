package Chapter01;

public class VarTest {
	public static void main(String[] args) {
		/*
		 * 기본타입(Primitive Type)
		 */
		//정수 : ont가 기본
		byte b = 1;
		short s = 10;
		int i = 2000;
		long l = 1234567890L;
		
		//실수 : double가 기본
		float f = 3.14f;
		double d = 3.14;
		
		//문자
		char c = 'A';
		char c2 = 65;
		
		//불린
		boolean bool = true;
		boolean bool2 = false;
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(c);
		System.out.println(c2);
		System.out.println(bool);
		System.out.println(bool2);
		
		/*
		 *  참조형 (reference type) : 객체를 참조함
		 */
		// 문자열은 기본 타입이 아니다.
		// 문자열은 기본타입 char가 모여있는(배열의 형태로) String이라는 클래스의 객체다.
		String str = "hello";
		// 객체의 값을 외부에서 변경할 수 없음, 메소드(함수)를 통해서 바꿔줘야함
		// 메소드 = length()
		System.out.println(str.length());
		
		// 지역변수 : 하나의 클래스의 정의를 제외한 블락({ })안에 들어있는 것들 -> for문의 i와 같은 변수를 말함 
		// 지역변수는 초기화가 되어야 함 -> 안되어 있는 상태로 사용하면 오류가 발생함
		// int j;
		// int i = j + 10; 초기화 되지 않은 변수를 사용하면 오류 발생
		
		// 상수 : 변수와 다르게 대문자로만 작성함
		int number = 10;
		System.out.println(number);
		number = 100;
		System.out.println(number);
		
		final int NUMBER2 = 10;
		// NUMBER2 = 100; 오류발생, 변수 선언에 final을 붙이면 상수 선언 = 초기화 이후 값을 대입할 수 없음
		System.out.println(NUMBER2);
	}
}
