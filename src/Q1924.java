import java.util.Scanner;
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



/*������ 2007�� 1�� 1�� �������̴�. �׷��ٸ� 2007�� x�� y���� ���� �����ϱ�? �̸� �˾Ƴ��� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� �� ĭ�� ���̿� �ΰ� x(1��x��12)�� y(1��y��31)�� �־�����. ����� 2007�⿡�� 1, 3, 5, 7, 8, 10, 12���� 31�ϱ���, 4, 6, 9, 11���� 30�ϱ���, 2���� 28�ϱ��� �ִ�.

���
ù° �ٿ� x�� y���� ���� ���������� ���� SUN, MON, TUE, WED, THU, FRI, SAT�� �ϳ��� ����Ѵ�.*/

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