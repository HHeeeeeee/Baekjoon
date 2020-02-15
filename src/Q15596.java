import java.util.Scanner;
public class Q15596 {
	final static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
        int num = in.nextInt();
        int numArr[] = new int[num];
        long result = (long)sum(numArr);
        System.out.println(result);
        in.close();
    }
    
    public static long sum(int[] a) {
        long sum = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
            sum += a[i];
        }
        return sum;        
    }
}