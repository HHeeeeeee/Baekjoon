import java.util.Arrays;
import java.util.Scanner;

public class Q3009 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int result[] = {0, 0};
		
		for (int i = 0; i < 3; i++) {
			String numStr = in.nextLine();
			int x = Integer.parseInt(numStr.split(" ")[0]);
			int y = Integer.parseInt(numStr.split(" ")[1]);
			
			result[0] ^= x;
			result[1] ^= y;
		}
		
		System.out.println(Arrays.toString(result).replace(",", "").replace("[", "").replace("]", ""));
	}
}




/*Scanner in = new Scanner(System.in);
int dot[][] = new int[3][2];

for (int i = 0; i < dot.length; i++) {
	for (int j = 0; j < 2; j++) {
		dot[i][j] = in.nextInt();
	}
}

int resultDot[][] = new int[1][1];
for (int i = 1; i < dot.length; i++) {
	for (int j = 0; j < 2; j++) {
		if (Math.abs(dot[i][j] - dot[i-1][j]) > 0) {	
			
		}
		
		
	}
}*/

/*if (Math.abs(dot[i][j] - dot[i-1][j]) > 0) {		
	resultDot[0][0] = Math.abs(dot[i][j] - dot[i-1][j]);
	System.out.println("00 : " + resultDot[0][0]);
} */
//if (Math.abs(dot[i-1][j] - dot[i-1][j-1]) > 0) {
	//System.out.println(dot[i-1][j-1]);
	//resultDot[0][1] = Math.abs(dot[i-1][j] - dot[i-1][j-1]);
	//System.out.println("01 : " + resultDot[0][1]);
//}

//System.out.println(resultDot);
//System.out.println(resultDot[0][0] + " " + resultDot[0][1]);

/*for(int i = 0; i < dot.length; i++) {
	for(int j = 0; j < 2; j++) {
		System.out.println(dot[i][j]);
	}
}*/
//System.out.println(dot[2][1]);
