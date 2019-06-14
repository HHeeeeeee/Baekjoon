import java.util.Scanner;
public class Q2438 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt(); 
		
		for(int i=0; i<x; i++){
			for(int j=0; j<=i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
//		for(int i = 0; i<3; i++){
//			for(int j=0; j<=i; j++){
//				System.out.print(i + "---" + j);
//			}
//			System.out.println();
//		}
	}
}
