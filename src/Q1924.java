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
		} else {	// 1월달인 경우, day로만 계산
			totalDay = day;
		}
		
		System.out.println(dayOfWeek[totalDay%7]);
	}
}*/

/*import java.util.Scanner;
public class Q1924 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int in_month = in.nextInt();	// 월 입력받은 값
		int in_day = in.nextInt();			// 일 입력받은 값
		String week[] = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};	// 요일
		String print = "";	// 출력할 요일
		int total_day = 0;	// 총 날짜 세서 7로 나눈 나머지 값으로 요일을 구함.
		
		int month[] = new int[12];
		month[0] = month[2] = month[4] = month[6] = month[7] = month[9] = month[11] = 31;
		month[3] = month[5] = month[8] = month[10] = 30;
		month[1] = 28;
		
		// 1월에 31->0, 2월에 28->1, 3월 31->->2, 4월 30->3, 5월 31->4, 6월 30->5, 7월 31->6, 8월 31->7, 9월 30->8, 10월 31->9, 11월 30->10, 12월 31->11
		
		for(int i=1; i<in_month; i++){
			total_day += month[i-1];	// 배열의 인덱스 값이 1씩 작은 값이 들어가 있으니까 -1을 해줌 -> 그걸 total_day값에 넣으면 입력받은 달 바로 이전 달까지만 날짜를 다 더해주고 해당 월에는 날짜in_day로 더해서 total_day를 구함. 
		}
		
		total_day += in_day;	// 입력받은 날짜 값을 더해주면 
		
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
