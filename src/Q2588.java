import java.util.Scanner;
public class Q2588 {
	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		int sum = 0;
		int n[] = new int[3];
		
		for (int i = 2; i >=0; i--) {	// 2踰덉㎏ �닔�쓽 媛� �옄由� �닔瑜� 異붿텧�빐�꽌 1踰덉㎏ �닔�옉 怨깆뀍
			char charTemp = String.valueOf(num2).charAt(i);
			int intTemp =  (int)charTemp - 48;
			n[i] = num1 * intTemp;
			System.out.println(n[i]);
		}
		
		for (int i = 2; i >=0; i--) {
			sum += n[i] * Math.pow(10, 2-i);
		}
		System.out.println(sum);
	}
}