import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.EmptyStackException;
import java.util.Stack;
import java.util.StringTokenizer;

public class Q10828 {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
	
		int count;
		try {
			count = Integer.parseInt(br.readLine());
			
			for (int i = 0; i < count; i++) {
				st = new StringTokenizer(br.readLine(), " ");
				
				String how = st.nextToken();
				
				switch (how) {
					case "push" : 
						int what = Integer.parseInt(st.nextToken());
						stack.push(what);
						break;
					case "pop" : 
						try {
							bw.write(stack.pop() + "\n");
						} catch (EmptyStackException e) {
							bw.write(-1 + "\n");
						}
						break;
					case "size" : 
						bw.write(stack.size() + "\n");
						break;
					case "empty" : 
						bw.write((stack.empty() ? "1" : "0") + "\n");
						break;
					case "top" : 
						try {
							bw.write(stack.peek() + "\n");
						} catch (EmptyStackException e) {
							bw.write(-1 + "\n");
						}
						break;
				}
			}
			
			bw.flush();
			bw.close();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
