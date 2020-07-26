import java.util.Scanner;
public class Q5585 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		n = 1000 - n;
		int result = 0;
		int charge[] = {500, 100, 50, 10, 5, 1};
		
		// ���� �ܵ����� ���ʴ�� ������, �ߺ��Ǵ� �ܵ��� ������ ����� ���ԵǹǷ� �ܵ���ŭ �ݺ��� ����
		for (int x : charge) {
			if (n >= x) {
				result += n/x;
				n %= x;
			}
		}
		
		System.out.println(result);
	}
}

/*	�ӵ� : 108ms - ù ��° Ǯ�̿� ������ �ð��� ����.
import java.util.Scanner;
public class Q5585 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		n = 1000 - n;
		int result = 0;
		
		while(true){
			if(n == 0){
				break;
			}
			
			if(n >= 500){
				result += (n/500);
				n -= (n/500)*500;
			}else if(n >= 100){
				result += (n/100);
				n -= (n/100)*100;
			}else if(n >= 50){
				result += (n/50);
				n -= (n/50)*50;
			}else if(n >= 10){
				result += (n/10);
				n -= (n/10)*10;
			}else if(n >= 5){
				result += (n/5);
				n -= (n/5)*5;
			}else{
				result++;
				n -= 1;
			}
		}
		System.out.println(result);
	}
}

*/



/*	�ӵ� : 112ms - ������ Ǯ�� �߿� ���� ����.
import java.util.Scanner;
public class Q5585 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		n = 1000 - n;
		int result = 0;
		
		while(true){
			if(n == 0){
				break;
			}
			
			if((n/500) > 0){
				result += (n/500);
				n -= (n/500)*500;
			}else if((n/100) > 0){
				result += (n/100);
				n -= (n/100)*100;
			}else if((n/50) > 0){
				result += (n/50);
				n -= (n/50)*50;
			}else if((n/10) > 0){
				result += (n/10);
				n -= (n/10)*10;
			}else if((n/5) > 0){
				result += (n/5);
				n -= (n/5)*5;
			}else{
				result++;
				n -= 1;
			}
		}
		System.out.println(result);
	}
}
*/
