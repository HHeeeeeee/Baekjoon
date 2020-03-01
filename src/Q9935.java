import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
public class Q9935 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			String str = br.readLine();
			String exceptWord = br.readLine();
			
			String exceptWordChar[] = new String[exceptWord.length()];
			for (int i = 0; i < exceptWord.length(); i++) {
				exceptWordChar[i] = Character.toString(exceptWord.charAt(i));
			}
			
			String newStr = "";
			for (int j = 0; j < str.length(); j++) {
				char ch = str.charAt(j);
				
				if (!(Arrays.asList(exceptWordChar).contains(Character.toString(ch)))) {
					newStr += Character.toString(ch);
				}
			}
			
			if (newStr.length() == 0) {
				newStr = "FRULA";
			}
			
			bw.write(newStr);
			bw.flush();
			bw.close();
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

/*import java.util.Arrays;
import java.util.Scanner;
public class Q9935 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		String exceptWord = in.nextLine();
		
		String exceptWordChar[] = new String[exceptWord.length()];
		for (int i = 0; i < exceptWord.length(); i++) {
			exceptWordChar[i] = Character.toString(exceptWord.charAt(i));
		}
		
		String newStr = "";
		for (int j = 0; j < str.length(); j++) {
			char ch = str.charAt(j);
			
			if (!(Arrays.asList(exceptWordChar).contains(Character.toString(ch)))) {
				newStr += Character.toString(ch);
			}
		}
		
		if (newStr.length() == 0) {
			newStr = "FRULA";
		}
		
		System.out.println(newStr);
	}
}*/