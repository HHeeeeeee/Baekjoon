import java.util.Scanner;
public class Q2747 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int f = 0;
		int fplus1 = 1;
		int sum = 0;
		
		for (int i = 0; i < n; i++) {
			sum = f + fplus1;

			System.out.println("i : " + i + ", f : " + f + ", f+1 : " + fplus1 + ", sum : " + sum);
			
			f = fplus1;
			fplus1 = sum;
		}
		System.out.println(f);
	}
}
