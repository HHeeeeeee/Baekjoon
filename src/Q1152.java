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
		
		String word[] = str.split(" ");		// 공백을 기준으로 문자열을 자름
		
		for(int i=0; i<word.length; i++){	// for문을 돌면서 공백이 있으면 count를 증가시킴 -> 공백의 수만큼 count가 증가됨.
			if(word[i].equals("")){
				count++;
			}
		}
		
		System.out.println(word.length-count);		// 처음에 공백 기준으로 문자열 자른 문자를 배열에 넣었는데 거기서 공백의 수인 count를 뺌. 그럼 원래 문자의 개수를 알 수 있음.
	}
}*/