import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q2562 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int max = 0;
		int n = 0;
		
		for (int i = 0; i < 9; i++) {
			int num = Integer.parseInt(br.readLine());
			
			if (num > max) {
				max = num;
				n = i+1;
			}
		}
		
		bw.write(max + "\n" + n);
		bw.flush();
		bw.close();
	}
}