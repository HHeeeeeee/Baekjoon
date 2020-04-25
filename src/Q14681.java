import java.util.Scanner;
public class Q14681 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int y = in.nextInt();
		
		// +x+y : 1, -x+y : 2, -x-y : 3, +x-y : 4 
		if (x > 0 && y > 0) {
			System.out.println(1);
		} else if (x < 0 && y >0) {
			System.out.println(2);
		} else if (x > 0 && y < 0) {
			System.out.println(4);
		} else {
			System.out.println(3);
		}
	}
}