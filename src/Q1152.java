import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q1152 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		try {
			st = new StringTokenizer(br.readLine());
			bw.write(st.countTokens() + "\n");
			
			bw.flush();
			bw.close();
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}


/*import java.util.Scanner;
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
}*/