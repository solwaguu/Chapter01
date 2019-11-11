package Chapter01;

public class Triangle {

	public static void main(String[] args) {
		/*
		 * X
		 * XX
		 * XXX
		 * XXXX
		 * XXXXX
		 * XXXXXX 
		 */

		for(int i = 1; i < 7; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("X");
			}
			System.out.println();
		}
		
	}

}
