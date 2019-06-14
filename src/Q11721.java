import java.util.Scanner;
public class Q11721 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String str = in.nextLine();
		int str_len = str.length();
		
		for(int i=0; i<str_len; i++){
			System.out.print(str.charAt(i));	// 문자열의 문자를 하나씩 출력함.
			if((i+1) % 10 == 0){	// i다음이 10으로 나눴을 때 0이면 다음 줄에 출력.
				System.out.println();
			}
		}
	}
}

/* 이것도 가능한 코드임
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