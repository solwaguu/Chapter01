package Chapter01;

public class SwitchTest {

	public static void main(String[] args) {
		 
		int month = 7;
		int days = 0;
		
		if(month ==1) {
			days = 31;
		} else if(month == 2) {
			days = 28;
		} else if(month == 3) {
			days = 31;
		} else if(month == 4) {
			days = 30;
		} else if(month == 5) {
			days = 31;
		} else if(month == 6) {
			days = 30;
		} else if(month == 7) {
			days = 31;
		} else if(month == 8) {
			days = 31;
		} else if(month == 9) {
			days = 30;
		} else if(month == 10) {
			days = 31;
		} else if(month == 11) {
			days = 30;
		} else if(month == 12) {
			days = 31;
		} else {
			System.out.println("1월 ~ 12월 까지만 입력합니다.");
			return;
		}
		System.out.println(month + "월은 " + days + "일 까지 있습니다.");
		
		System.out.println("====================================================");
		
		// 논리 연산자 활용
		if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			days = 31;
		} else if( month == 4 || month == 6 || month == 9 || month == 11) {
			days = 30;
		} else if( month ==2) {
			days = 28;
		}
		System.out.println(month + "월은 " + days + "일 까지 있습니다.");

		System.out.println("====================================================");
		
		// equal관계에서 적용된다, case문 안에서 break선언을 하지 않으면 default로 떨어짐
		switch(month) {
			case 1:{
				days = 31;
				break;
			}
			case 2:{
				days = 28;
				break;
			}
			case 3:{
				days = 31;
				break;
			}
			case 4:{
				days = 30;
				break;
			}
			case 5:{
				days = 31;
				break;
			}
			case 6:{
				days = 30;
				break;
			}
			case 7:{
				days = 31;
				break;
			}
			case 8:{
				days = 31;
				break;
			}
			case 9:{
				days = 30;
				break;
			}
			case 10:{
				days = 31;
				break;
			}
			case 11:{
				days = 30;
				break;
			}
			case 12:{
				days = 31;
				break;
			}
			default: {
				System.out.println("1 ~ 12까지만 입력해 주세요.");
				return;
			}
		}
		System.out.println(month + "월은 " + days + "일 까지 있습니다.");
		
		System.out.println("====================================================");
		
		switch(month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:{
				days = 31;
				break;
			}
			case 4:
			case 6:
			case 9:
			case 11:{
				days = 30;
				break;
			}
			case 2:{
				days = 28;
				break;
			}
			default: {
				System.out.println("1 ~ 12까지만 입력해 주세요.");
				return;
			}
		}
		System.out.println(month + "월은 " + days + "일 까지 있습니다.");
	}

}
