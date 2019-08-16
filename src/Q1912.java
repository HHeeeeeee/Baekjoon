import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
public class Q1912 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int count = Integer.parseInt(br.readLine());
		
		int num[] = new int[count];
		int sum[] = new int[count];
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < count; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		
		sum[0] = num[0];
		int max = sum[0];
		for (int j = 1; j < count; j++) {
			sum[j] = Math.max(sum[j-1] + num[j], num[j]);
			max = Math.max(max, sum[j]);
		}

		bw.write(max + "\n");
		bw.close();
	}
}