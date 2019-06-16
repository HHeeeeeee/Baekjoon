import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Q10871 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = in.nextInt();
		int standard = in.nextInt();
		List<Integer> printInt = new ArrayList<Integer>();
		
		for (int i=0; i<count; i++) {
			Integer num = in.nextInt();
			if (num < standard) {
				printInt.add(num);
			}
		}
		
		for (Integer print : printInt) {
			System.out.print(print + " ");
		}
	}
}
