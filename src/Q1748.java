import java.util.Scanner;

public class Q1748 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int temp = num;
		int length = (int)(Math.log10(num)+1);	// 숫자 자릿수 구하기
		int sum = 0;
		int count = 1;
		int mulNum = 9;
		while (temp > 0) {
			if (temp < 10) {
				sum += ((num - Math.pow(10, length-1)) + 1) * count;
				break;
			} else {
				sum += (count * mulNum);
				temp = temp / 10;
				count ++;
				mulNum *= 10;
			}
		}
		System.out.println(sum);
	}
}
