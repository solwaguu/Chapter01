package Chapter01;

public class TypeCast {

	public static void main(String[] args) {
		// implicity(암묵적) Type Cast : 작은데이터를 큰곳에서 부를 수 있음
		int i = 10;
		long l = i;
		// 타입의 형태가 다른데 입력이 되었음
		System.out.println(i + ":" + l);
		
		long l2 = 1234567890L; 
		// int i2 = l2; 오류발생 int(4byte), long(8byte)
		// explicity(명시적) Type Cast : 오류를 무시함
		int i2 = (int)l2;
		System.out.println(i2);
	}

}
