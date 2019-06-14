import java.util.Scanner;
public class Q2439 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		
//		for(int i=1; i<=x; i++){
//			for(int j=(x-1); j<i; j--){
//				System.out.print("a");
//			}
//			for(int k=1; k<=i; k++){
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		for(int i=0;i<x;i++){
			for(int j=x-i;j>1;j--){
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++){
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
