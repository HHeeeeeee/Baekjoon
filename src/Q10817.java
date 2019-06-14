import java.util.Scanner;
public class Q10817 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		
		if(a>=b && a>=c){	// a가 제일 큰 값
			if(b>=c){	// b가 두 번째로 큰 값
				System.out.println(b);
			}else{		// c가 두 번째로 큰 값
				System.out.println(c);
			}
		}else if(b>=a && b>=c){		// a가 제일 큰 값
			if(a>=c){	// a가 두 번째로 큰 값
				System.out.println(a);
			}else{		// c가 두 번째로 큰 값
				System.out.println(c);
			}
		}else{
			if(a>=b){
				System.out.println(a);
			}else{
				System.out.println(b);
			}
		}

	}

}
