package num4;

import java.util.Calendar;
import java.util.*;


public class num4 {

	public static void main(String[] args) {
		
		String d = "";
		
		Scanner Input = new Scanner(System.in);
		
		System.out.print("�⵵�� �Է��ϼ���: ");
		int year = Input.nextInt();
		System.out.print("���� �Է��ϼ���: ");
		int month = Input.nextInt();
		System.out.print("���� �Է��ϼ���: ");
		int day = Input.nextInt();
		
		Calendar cal = Calendar.getInstance();
		
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month-1);
		cal.set(Calendar.DATE, day);
	
		switch(cal.get(Calendar.DAY_OF_WEEK)) {
		case 1:
			d="�Ͽ���";
			break;
		case 2:
			d="������";
			break;
		case 3:
			d="ȭ����";
			break;
		case 4:
			d="������";
			break;
		case 5:
			d="�����";
			break;
		case 6:
			d="�ݿ���";
			break;
		default:
			d="�����";
			break;
	}

	System.out.println(d);
	}

}
