import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q10870 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		System.out.println(Fibonacci(num));
	}
	
	public static int Fibonacci(int num) {
		if (num == 0) {
			return num;
		} else if (num == 1) {
			return 1;
		} else {
			return Fibonacci(num-1) + Fibonacci(num-2);
		}
	}
}
