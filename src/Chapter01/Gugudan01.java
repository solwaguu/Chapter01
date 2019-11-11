package Chapter01;

public class Gugudan01 {

	public static void main(String[] args) {
		// while문 2개로 구구단 만들기
		
		int i = 2;
		int j = 1;
		int result = 0;
		
		while(i < 10) {
			//System.out.println(i);
			while(j < 10) {
				result = i * j;
				System.out.println(i + " * " + j + " = " + result);
				j++;
			}
			i++;
			j = 1;
		}
	}   

}
