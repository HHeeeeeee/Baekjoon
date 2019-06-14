import java.util.Scanner;
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
		
		/*if(day%7==0){
			print = week[6];
		}else if(day%7==1){
			print = week[0];
		}else if(day%7==2){
			print = week[1];
		}else if(day%7==3){
			print = week[2];
		}else if(day%7==4){
			print = week[3];
		}else if(day%7==5){
			print = week[4];
		}else{
			print = week[5];
		}	*/
		
		
		//if(month ==1){
			
			
			/*for(int i=1; i<=day; i++){
				for(int j=0; j<7; j++){
					print = week[j];
					System.out.println("i+print : " + i + print);
				}
			}*/
			
		//}
		
		System.out.println(print);
		
		
		
		
		
		
		
	/*	for(int i=0; i<7; i++){
			print = week[i];
		}
		System.out.println(print);*/
		
		
		
		
	/*	if(month == 1){
			for(int j=1; j<=day; j++){
				for(int i=0; i<7; i++){
					print = week[i];
				}
				System.out.println(print);
			}
			
		}
		*/
		
		
		/* *if(month==1 | month==3 | month==5 | month==7 | month==8 | month==10 | month==12){
			for(int j=1; j<=31; j++){
				
			}
		}*/
		
		/*for(int i=1; i<=12; i++){
			if(i==1 | i==3 | i==5 | i==7 | i==8 | i==10 | i==12){
				for(int j=1; j<=31; j++){
					
				}
			}
		}*/
	}
}



/*오늘은 2007년 1월 1일 월요일이다. 그렇다면 2007년 x월 y일은 무슨 요일일까? 이를 알아내는 프로그램을 작성하시오.

입력
첫째 줄에 빈 칸을 사이에 두고 x(1≤x≤12)와 y(1≤y≤31)이 주어진다. 참고로 2007년에는 1, 3, 5, 7, 8, 10, 12월은 31일까지, 4, 6, 9, 11월은 30일까지, 2월은 28일까지 있다.

출력
첫째 줄에 x월 y일이 무슨 요일인지에 따라 SUN, MON, TUE, WED, THU, FRI, SAT중 하나를 출력한다.*/

/*switch(i){
case 1 :
case 3 :
case 5 :
case 7 :
case 8 :
case 10 :
case 12:
	for(int j=1; j<=31; j++){
		
	}
	break;

case 4 :
case 6 :
case 9 :
case 11 :
	for(int j=1; j<=30; j++){
		
	}
	break;

case 2 :
	for(int j=1; j<=28; j++){
		
	}
	break;
}*/