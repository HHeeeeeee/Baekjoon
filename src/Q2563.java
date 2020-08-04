import java.util.Scanner;
public class Q2563 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean board[][] = new boolean[100][100];
		int count = in.nextInt();
		
		for (int i = 0; i < count; i++) {
			int x = in.nextInt();
			int y = in.nextInt();
			
			for (int j = (x-1); j < (x+9); j++) {
				for (int k = (y-1); k < (y+9); k++) {
					board[j][k] = true;
				}
			}
		}
		
		int result = 0;
		for (boolean arr[] : board) {
			for (boolean resultArr : arr) {
				if (resultArr) {
					result ++;
				}
			}
		}
		
		System.out.println(result);
	}
}