import java.util.Scanner;
public class Q1924 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int endOfMonth[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String dayOfWeek[] = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
		int month = in.nextInt();
		int day = in.nextInt();
		int totalDay = 0;
		
		for (int i = 0; i < month-1; i++){
			totalDay += endOfMonth[i];
		}
		totalDay += day;
		
		System.out.println(dayOfWeek[totalDay%7]);
	}
}

/*import java.util.Scanner;
public class Q1924 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int endOfMonth[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String dayOfWeek[] = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
		int month = in.nextInt();
		int day = in.nextInt();
		int totalDay = 0;
		
		if (month > 1) {
			for (int i = 0; i < month-1; i++){
				totalDay += endOfMonth[i];
			}
			totalDay += day;
		} else {	// 1������ ���, day�θ� ���
			totalDay = day;
		}
		
		System.out.println(dayOfWeek[totalDay%7]);
	}
}*/

/*import java.util.Scanner;
public class Q1924 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int in_month = in.nextInt();	// �� �Է¹��� ��
		int in_day = in.nextInt();			// �� �Է¹��� ��
		String week[] = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};	// ����
		String print = "";	// ����� ����
		int total_day = 0;	// �� ��¥ ���� 7�� ���� ������ ������ ������ ����.
		
		int month[] = new int[12];
		month[0] = month[2] = month[4] = month[6] = month[7] = month[9] = month[11] = 31;
		month[3] = month[5] = month[8] = month[10] = 30;
		month[1] = 28;
		
		// 1���� 31->0, 2���� 28->1, 3�� 31->->2, 4�� 30->3, 5�� 31->4, 6�� 30->5, 7�� 31->6, 8�� 31->7, 9�� 30->8, 10�� 31->9, 11�� 30->10, 12�� 31->11
		
		for(int i=1; i<in_month; i++){
			total_day += month[i-1];	// �迭�� �ε��� ���� 1�� ���� ���� �� �����ϱ� -1�� ���� -> �װ� total_day���� ������ �Է¹��� �� �ٷ� ���� �ޱ����� ��¥�� �� �����ְ� �ش� ������ ��¥in_day�� ���ؼ� total_day�� ����. 
		}
		
		total_day += in_day;	// �Է¹��� ��¥ ���� �����ָ� 
		
		if(total_day%7 == 0){
			print = week[6];
		}else if(total_day%7==1){
			print = week[0];
		}else if(total_day%7==2){
			print = week[1];
		}else if(total_day%7==3){
			print = week[2];
		}else if(total_day%7==4){
			print = week[3];
		}else if(total_day%7==5){
			print = week[4];
		}else{
			print = week[5];
		}
		
		System.out.println(print);
	}
}*/
