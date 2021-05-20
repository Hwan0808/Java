package num5;

import java.util.Calendar;

public class num5 {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();

		String d = "";
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int day = cal.get(Calendar.DATE);
		
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
		
		System.out.println("오늘은 " + year + "년 " + month + "월 " + day + "일 " + d + "입니다."  );
		System.out.println("이 달의 " + cal.get(Calendar.DAY_OF_WEEK_IN_MONTH) + "번째 " + d + "입니다."  );
		System.out.println("이 달의 " + cal.get(Calendar.WEEK_OF_MONTH) + "번째 주입니다."  );
		System.out.println("이 달의 " + cal.get(Calendar.DAY_OF_YEAR) + "일입니다."  );
		System.out.println("이 달의 " + cal.get(Calendar.WEEK_OF_YEAR) + "번째 주입니다."  );

	}

}

