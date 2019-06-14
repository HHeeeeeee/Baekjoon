import java.util.Scanner;
public class Q4344 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int totalNum = in.nextInt();
		float print[] = new float [totalNum];	// 각각의 출력 결과를 담아놓을 배열
		
		for(int i=0; i<totalNum; i++){
			int count = in.nextInt();	// 총 인원
			float score[] = new float[count];	// 점수
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

// 제공된 점수들의 평균을 구하고 그 점수들 중에 평균을 넘는 사람이 몇명인지 구하고
// 그렇게 평균을 넘는 인원이 몇 퍼센트인지 비율을 구하기
// 평균을 넘는 인원 / 총 인원 * 100


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
			
