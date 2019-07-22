import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;

public class Q3052 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		HashSet<Integer> modSet = new HashSet<>();
		
		for (int i = 0; i < 10; i++) {
			int num = Integer.parseInt(br.readLine());
			int mod = num % 42;
			
			if (!(modSet.contains(mod))) {
				modSet.add(mod);
			}
		}
		
		bw.write(modSet.size() + "\n");
		
		bw.flush();
		bw.close();
	}
}
