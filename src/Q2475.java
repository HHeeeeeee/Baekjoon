import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q2475 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int result = 0;
		
		try {
			st = new StringTokenizer(br.readLine(), " ");
			
			while (st.hasMoreTokens()) {
				result += Math.pow(Integer.parseInt(st.nextToken()), 2);
			}
			
			bw.write(result % 10 + "\n");
			
			bw.flush();
			bw.close();
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
