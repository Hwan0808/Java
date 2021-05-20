package num6;

import java.util.*;

public class num6 {
	
	public static void print(int k, int date) { // k는 공백 개수, date는 월의 마지막 날짜 
			int count=1;
			for(int i=0;i<6;i++) {
				for(int j=0;j<7;j++) {
					if(i<k && j==0) {
						System.out.print("\t");
					} else {
						if(count<=date)
							System.out.print(count+++"\t");
					}
				}
				System.out.println();
			}
		}
	
		public static void main(String[] args) {

			Calendar cal = Calendar.getInstance();
			
			int year = cal.get(Calendar.YEAR);
			int month = cal.get(Calendar.MONTH)+1;
			int date = cal.get(Calendar.DATE);
			
			System.out.println(year+"년 "+month+"월  달력\n");
			System.out.println("일\t월\t화\t수\t목\t금\t토");
			
			int k = cal.get(Calendar.DAY_OF_WEEK);
			
			switch(month) {
			case 1:
			case 3:
			case 5: 
			case 7:
			case 8: 
			case 10: 
			case 12:
				print(k,31);
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				print(k,30);
				break;
			case 2:
				print(k,28);
				break;
			default:
				break;
			}
		}
	}

