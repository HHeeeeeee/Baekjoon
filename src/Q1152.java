import java.util.Scanner;
public class Q1152 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		int count = 0;
		
		String word[] = str.split(" ");		// ������ �������� ���ڿ��� �ڸ�
		
		for(int i=0; i<word.length; i++){	// for���� ���鼭 ������ ������ count�� ������Ŵ -> ������ ����ŭ count�� ������.
			if(word[i].equals("")){
				count++;
			}
		}
		
		System.out.println(word.length-count);		// ó���� ���� �������� ���ڿ� �ڸ� ���ڸ� �迭�� �־��µ� �ű⼭ ������ ���� count�� ��. �׷� ���� ������ ������ �� �� ����.
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