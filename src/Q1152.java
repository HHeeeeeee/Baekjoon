import java.util.Scanner;
public class Q1152 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		int count = 0;
		
		String word[] = str.split(" ");		// 공백을 기준으로 문자열을 자름
		
		for(int i=0; i<word.length; i++){	// for문을 돌면서 공백이 있으면 count를 증가시킴 -> 공백의 수만큼 count가 증가됨.
			if(word[i].equals("")){
				count++;
			}
		}
		
		System.out.println(word.length-count);		// 처음에 공백 기준으로 문자열 자른 문자를 배열에 넣었는데 거기서 공백의 수인 count를 뺌. 그럼 원래 문자의 개수를 알 수 있음.
	}
}


/*Scanner in = new Scanner(System.in);
String str = in.nextLine();
int count = 0;

String word[] = str.split(" ");
count = word.length;

System.out.println(count);*/



/*Scanner in = new Scanner(System.in);

String str = in.nextLine();
int len = str.length();

String voca[] = str.split(" ");

for(int i=0; i<=len; i++){
	System.out.println(voca[i]);
	System.out.println(i);
}*/