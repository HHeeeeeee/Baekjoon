import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2743 {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			String str = br.readLine();
			bw.write(str.length() + "\n");
			
			bw.flush();
			bw.close();
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}


/*
import java.util.Scanner;

public class Q2743 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		
		System.out.println(str.length());
	}
}*/
