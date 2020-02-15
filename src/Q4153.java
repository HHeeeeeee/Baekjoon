import java.util.Scanner;
import java.util.Arrays;

public class Q4153 {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        while (true) {
            int num[] = new int[3];
            for (int i = 0; i < 3; i++) {
                num[i] = in.nextInt();
            }

            Arrays.sort(num);

            if (num[0] == 0) {
                break;
            } else {
                if (Math.pow(num[2], 2) == Math.pow(num[1], 2) + Math.pow(num[0], 2)) {
                    System.out.println("right");
                } else {
                    System.out.println("wrong");
                }
            }
        }
        
        in.close();
	}
}