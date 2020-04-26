import java.util.Scanner;
public class Q2523 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = in.nextInt();
		
		for (int i = 1; i <= count; i++) {
			for (int j = 1; j <= i; j ++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int k = (count -1); k >= 0; k--) {
			for (int l = (k-1); l >= 0; l--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
