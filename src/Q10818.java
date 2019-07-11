import java.util.Arrays;
import java.util.Scanner;
public class Q10818 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = in.nextInt();
		int num[] = new int[count];
		
		for (int i = 0; i < count; i++) {
			num[i] = in.nextInt();
		}
		
		Arrays.sort(num);
		System.out.println(num[0] + " " + num[count-1]);
	}
}
