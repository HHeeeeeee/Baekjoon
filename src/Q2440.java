import java.util.Scanner;
public class Q2440 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		
		for(int i=0; i<=x; i++){
			for(int j=x; j>i; j--){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
