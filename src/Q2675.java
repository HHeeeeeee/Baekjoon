import java.util.Scanner;
public class Q2675 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = in.nextInt();		// 몇 개를 입력받을건지
		int repeat[] = new int[count];	// 반복할 횟수
		String str[] = new String[count];	// 반복할 문자열	
		for(int i=0; i<count; i++){
			repeat[i] = in.nextInt();
			str[i] = in.next();
		}
		for(int i=0; i<count; i++){
			for(int j=0; j<str[i].length(); j++){	// 반복할 문자열의 길이만큼
				for(int k=0; k<repeat[i]; k++){  // 반복할 횟수만큼
					System.out.print(str[i].charAt(j));	  // 반복해서 출력
				}
			}
			System.out.println();
		}
	}
}
