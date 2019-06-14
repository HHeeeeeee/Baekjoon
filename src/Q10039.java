import java.util.Scanner;
public class Q10039 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int score[];
		int sum = 0;
		int avg = 0;
		
		for(int i=0; i<5; i++){
			score = new int[5];
			score[i] = in.nextInt();
			
			if(score[i]<40){
				score[i]=40;
			}
			
			sum += score[i];
			avg = sum/5;
		}
		System.out.println(avg);
		
		/*int score = in.nextInt();
		
		if(score<40){
			score = 40;
		}
		
		int sum = 0; 
		sum = sum + score;
		
		int avg;
		avg = sum/5;
		
		System.out.println(avg);*/
	}

}
