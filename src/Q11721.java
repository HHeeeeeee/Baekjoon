import java.util.Scanner;
public class Q11721 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String str = in.nextLine();
		int str_len = str.length();
		
		for(int i=0; i<str_len; i++){
			System.out.print(str.charAt(i));	// ���ڿ��� ���ڸ� �ϳ��� �����.
			if((i+1) % 10 == 0){	// i������ 10���� ������ �� 0�̸� ���� �ٿ� ���.
				System.out.println();
			}
		}
	}
}

/* �̰͵� ������ �ڵ���
 * 
 * for(int i=0; i<str.length(); i++){
	if(i!=0 && i%10==0){
		System.out.println();
	}
	System.out.print(str.charAt(i));
}*/



/*String str = in.nextLine();
String line10[] = new String[str.length()];

for(int i=0; i<str.length(); i++){
	if(str.length() == 10){
		//line10[i] = str.trim();
		System.out.println(str);
	}
	
}
*/