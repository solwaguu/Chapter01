package Chapter01;

public class TypeCast1 {
	
	public static void main(String[] args) {
		
		byte b = 25;
		short s = b;
		int i = s;
		long l = i;
		float f = i;
		double d = f;

		// byte b0 = 256;
		// 1byte 안에 들어갈 수 있는 수는 제한적임, 1byte = 8bit, 8개의 공간이 있음 = 2진수로 255가 최대
		byte b1 = (byte)256; 

		System.out.println("b = " + b);
		System.out.println("s = " + s);
		System.out.println("i = " + i);
		System.out.println("l = " + l);

		System.out.println("f = " + f);
		System.out.println("d = " + d);
		System.out.println("b1 = " + b1);

	}
}
