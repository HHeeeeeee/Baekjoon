import java.util.Scanner;
public class Q4344 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int totalNum = in.nextInt();
		float print[] = new float [totalNum];	// ������ ��� ����� ��Ƴ��� �迭
		
		for(int i=0; i<totalNum; i++){
			int count = in.nextInt();	// �� �ο�
			float score[] = new float[count];	// ����
			float sum = 0;
			float avg = 0;
			float avgCount = 0;
			for(int j=0; j<count; j++){
				score[j] = in.nextInt();
				sum += score[j];
			}
			avg = sum / count;
			for(int j=0; j<count; j++){
				if(score[j]>avg){
					avgCount++;
				}
			}
			print[i] = avgCount/count*100;
		}
		for(int i=0; i<totalNum; i++){
			System.out.format("%.3f", print[i]);
			System.out.println("%");
		}
	}
}

// ������ �������� ����� ���ϰ� �� ������ �߿� ����� �Ѵ� ����� ������� ���ϰ�
// �׷��� ����� �Ѵ� �ο��� �� �ۼ�Ʈ���� ������ ���ϱ�
// ����� �Ѵ� �ο� / �� �ο� * 100


/* 

		int num = in.nextInt();
		int sum = 0;
		
		for(int i=0; i<num; i++){
			int scoreNum = in.nextInt();
			for(int j=0; j<scoreNum; j++){
				int score[] = new int[scoreNum];
				score[j] = in.nextInt();
				sum += score[j];
				System.out.format("%.4f", sum/scoreNum);
			}
		}
*/
 

/*for(int j=0; j<count; j++){
	System.out.println(score[j]);
}*/
/*for(int j=0; i<count; i++){
	if(score[j]>=avg){
		System.out.println(score[j]);
		avgCount++;
	}
}*/

/* 
 
			System.out.println("avg"+avg);
			System.out.println("avgCount"+avgCount);
			System.out.println("count"+count);
			System.out.println("avgCount/count"+avgCount/count);
*/
			
