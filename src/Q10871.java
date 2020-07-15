import java.util.Scanner;

public class Q10871 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int x = in.nextInt();

		int arr[] = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] < x) {
				System.out.print(arr[j] + " ");
			}
		}
	}
}

/*import java.util.ArrayList;
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
}*/
