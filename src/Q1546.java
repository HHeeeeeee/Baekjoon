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
		
		int sub = in.nextInt();		// ���� ����
		
		int score[] = new int[sub];		// ���� ���� �޾ƿ� �迭
		
		int max = 0;	// �ְ���
		
		for(int i=0; i<sub; i++){		// ������ ���� ���� �ݺ��ؼ� �޾Ƽ� �迭�� ����
			score[i] = in.nextInt();
		}
		
		
		for(int i=0; i<sub; i++){	
			if(score[i] > max){		// �ִ밪�� 0���� �ʱ�ȭ�س��� max������ ���� Ŭ ��� max���� �ִ밪�� ����.
				max = score[i];
			}
		}
		//System.out.println(max);
		//�������� �ְ����� 70�̰�, ���������� 50�̾����� ���������� 50/70*100�� �Ǿ� 71.43���� �ȴ�.
		float avg[] = new float[sub];	// ���ο� ��� ���� �� �ʿ��� �迭
		float sum = 0;
		for(int i=0; i<sub; i++){
			avg[i] = ((float)score[i]/max*100);
			sum += avg[i];		// ���ο� �� ��
			//System.out.println("avg"+avg[i]);
			//System.out.println("sum"+sum);
		}
		System.out.println(sum/sub);	//�Ҽ��� �Ѥ��ڸ����� ���
	}
}



*/
/*double sum = 0;		// ��� ���� �� �ʿ��� ���� �ʱ�ȭ

double re_score[] = new double[sub];

for(int i=0; i<sub; i++){
	re_score[i] = score[i]/max*100;		// ���� ���� ���ϴ� ��
	sum += re_score[i];		// ���� ���ϱ�
}
System.out.println(sum/sub);	// ���� / ���� ����*/





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