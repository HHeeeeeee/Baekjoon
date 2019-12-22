import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q10872 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		bw.write(factorial(num) + "\n");
		br.close();
		bw.flush();
		bw.close();
	}
	
	public static int factorial(int num) {
		if (num == 0) {
			return 1;
		} else {
			return factorial(num-1) * num;
		}
	}
}