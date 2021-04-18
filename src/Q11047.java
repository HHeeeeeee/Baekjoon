import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q11047 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		try {
			st = new StringTokenizer(br.readLine(), " ");
			int count = Integer.parseInt(st.nextToken());
			int price = Integer.parseInt(st.nextToken());
			int coinCount = 0;
			
			int coinArr[] = new int[count];
			for (int i = 0; i < count; i++) {
				coinArr[i] = Integer.parseInt(br.readLine());
			}
			
			Arrays.sort(coinArr);
		
			for (int j = count-1; j >= 0; j --) {
				if ((price > 0) && (price - coinArr[j]) >= 0) {
					coinCount = coinCount + (price/coinArr[j]);
					price = price % coinArr[j];
				}
			}
		
			bw.write(coinCount + "\n");
			
			bw.flush();
			bw.close();
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
