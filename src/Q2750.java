import java.util.Scanner;
public class Q2750 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = in.nextInt();
		int num[] = new int[count];
		int temp = 0;
		for(int i=0; i<count; i++){
			num[i] =  in.nextInt();
		}
		for(int i=0; i<count; i++){
			for(int j=i+1; j<count; j++){
				if(num[i]>num[j]){
					temp = num[j];
					num[j] = num[i];
					num[i] = temp;
				}
			}
		}
		for(int i=0; i<count; i++){
			System.out.println(num[i]);
		}
	}
}
