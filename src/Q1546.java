import java.util.Scanner;
public class Q1546 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int sub = in.nextInt();	
		
		int score[] = new int[sub];		
		
		int max = 0;
		
		for(int i=0; i<sub; i++){	
			score[i] = in.nextInt();
		}
		
		
		for(int i=0; i<sub; i++){	
			if(score[i] > max){		
				max = score[i];
			}
		}
		float avg[] = new float[sub];
		float sum = 0;
		for(int i=0; i<sub; i++){
			avg[i] = ((float)score[i]/max*100);
			sum += avg[i];
		}
		System.out.format("%.2f", sum/sub);
	}
}



/*import java.util.Scanner;
public class Q1546 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int sub = in.nextInt();		// 과목 개수
		
		int score[] = new int[sub];		// 과목 점수 받아올 배열
		
		int max = 0;	// 최고점
		
		for(int i=0; i<sub; i++){		// 각각의 과목 점수 반복해서 받아서 배열에 저장
			score[i] = in.nextInt();
		}
		
		
		for(int i=0; i<sub; i++){	
			if(score[i] > max){		// 최대값을 0으로 초기화해놓고 max값보다 값이 클 경우 max값에 최대값을 넣음.
				max = score[i];
			}
		}
		//System.out.println(max);
		//세준이의 최고점이 70이고, 수학점수가 50이었으면 수학점수는 50/70*100이 되어 71.43점이 된다.
		float avg[] = new float[sub];	// 새로운 평균 구할 때 필요한 배열
		float sum = 0;
		for(int i=0; i<sub; i++){
			avg[i] = ((float)score[i]/max*100);
			sum += avg[i];		// 새로운 총 합
			//System.out.println("avg"+avg[i]);
			//System.out.println("sum"+sum);
		}
		System.out.println(sum/sub);	//소수점 둘쨰자리까지 출력
	}
}



*/
/*double sum = 0;		// 평균 구할 떄 필요한 총합 초기화

double re_score[] = new double[sub];

for(int i=0; i<sub; i++){
	re_score[i] = score[i]/max*100;		// 새로 점수 구하는 거
	sum += re_score[i];		// 총합 더하기
}
System.out.println(sum/sub);	// 총합 / 과목 개수*/





//Scanner in = new Scanner(System.in);
//
//int num = in.nextInt();
//float score[];
//int i;
//
//for(i=1; i<=num; i++ ){
//	score = new float[i];
//	score[i] = in.nextFloat();
//}
//
//score[i]
//
/*
Scanner in = new Scanner(System.in);

int num = in.nextInt();
int score = 0;

for(int i=0; i<num; i++){
	score = in.nextInt();
}


*/




/*
int num = in.nextInt();
int [] score = new int[num];

int max = 0;
double avg = 0.0;

for(int i=0; i<num; i++){
	score[i] = in.nextInt();
	if(max<score[i]){
		max = score[i];
	}
}

for(int i=0; i<num; i++){
	avg += (float)score[i]/max*100;
}

System.out.printf("%.2f", avg/num);*/


/*if(score[i]>score[i+1]){
max = score[i]; 	// 
//score[i] = score[i+1];
}*/