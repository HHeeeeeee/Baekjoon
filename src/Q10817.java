import java.util.Scanner;
public class Q10817 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		
		if(a>=b && a>=c){	// a�� ���� ū ��
			if(b>=c){	// b�� �� ��°�� ū ��
				System.out.println(b);
			}else{		// c�� �� ��°�� ū ��
				System.out.println(c);
			}
		}else if(b>=a && b>=c){		// a�� ���� ū ��
			if(a>=c){	// a�� �� ��°�� ū ��
				System.out.println(a);
			}else{		// c�� �� ��°�� ū ��
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
