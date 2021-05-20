package num4;

import java.util.Calendar;
import java.util.*;


public class num4 {

	public static void main(String[] args) {
		
		String d = "";
		
		Scanner Input = new Scanner(System.in);
		
		System.out.print("년도를 입력하세요: ");
		int year = Input.nextInt();
		System.out.print("월을 입력하세요: ");
		int month = Input.nextInt();
		System.out.print("일을 입력하세요: ");
		int day = Input.nextInt();
		
		Calendar cal = Calendar.getInstance();
		
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month-1);
		cal.set(Calendar.DATE, day);
	
		switch(cal.get(Calendar.DAY_OF_WEEK)) {
		case 1:
			d="일요일";
			break;
		case 2:
			d="월요일";
			break;
		case 3:
			d="화요일";
			break;
		case 4:
			d="수요일";
			break;
		case 5:
			d="목요일";
			break;
		case 6:
			d="금요일";
			break;
		default:
			d="토요일";
			break;
	}

	System.out.println(d);
	}

}
