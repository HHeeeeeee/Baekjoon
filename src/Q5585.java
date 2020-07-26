import java.util.Scanner;
public class Q5585 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		n = 1000 - n;
		int result = 0;
		int charge[] = {500, 100, 50, 10, 5, 1};
		
		// 높은 잔돈부터 차례대로 빠지고, 중복되는 잔돈은 몫으로 결과에 포함되므로 잔돈만큼 반복문 돌기
		for (int x : charge) {
			if (n >= x) {
				result += n/x;
				n %= x;
			}
		}
		
		System.out.println(result);
	}
}

/*	속도 : 108ms - 첫 번째 풀이와 동일한 시간이 나옴.
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



/*	속도 : 112ms - 세가지 풀이 중에 제일 느림.
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
