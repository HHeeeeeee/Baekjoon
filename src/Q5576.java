import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Q5576 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int wScores[] = new int[10];
		int kScores[] = new int[10];
		
		try {
			for (int i = 0; i < 10; i ++) {
				wScores[i] = Integer.parseInt(br.readLine());
			}
			
			for (int j = 0; j < 10; j ++) {
				kScores[j] = Integer.parseInt(br.readLine());
			}
			
			Arrays.sort(wScores);
			Arrays.sort(kScores);
			
			int wAvg = wScores[7] + wScores[8] + wScores[9];
			int kAvg = kScores[7] + kScores[8] + kScores[9];
			
			bw.write(wAvg + " " + kAvg);
			
			bw.flush();
			bw.close();
			br.close();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
