import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Q10773 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int count;
		Stack<Integer> stack = new Stack();
		try {
			count = Integer.parseInt(br.readLine());
			int sum = 0;
			
			for (int i = 0; i < count; i++) {
				int num = Integer.parseInt(br.readLine());
				if (num == 0) {
					stack.pop();
				} else {
					stack.push(num);
				}
			}
			
			for (int num : stack) {
				sum += num;
			}
			bw.write(sum + "\n");
			
			br.close();
			bw.close();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
