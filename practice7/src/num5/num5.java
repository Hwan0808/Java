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
		
		System.out.println("������ " + year + "�� " + month + "�� " + day + "�� " + d + "�Դϴ�."  );
		System.out.println("�� ���� " + cal.get(Calendar.DAY_OF_WEEK_IN_MONTH) + "��° " + d + "�Դϴ�."  );
		System.out.println("�� ���� " + cal.get(Calendar.WEEK_OF_MONTH) + "��° ���Դϴ�."  );
		System.out.println("�� ���� " + cal.get(Calendar.DAY_OF_YEAR) + "���Դϴ�."  );
		System.out.println("�� ���� " + cal.get(Calendar.WEEK_OF_YEAR) + "��° ���Դϴ�."  );

	}

}

