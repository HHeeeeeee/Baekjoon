import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q18258 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		Queue<Integer> queue = new LinkedList<Integer>();

		try {
			int count = Integer.parseInt(br.readLine());
			int what = 0;
			
			for (int i = 0; i < count; i++) {
				st = new StringTokenizer(br.readLine(), " ");
				String how = st.nextToken();
				
				switch (how) {
					case "push" :
						what = Integer.parseInt(st.nextToken());
						queue.offer(what);
						break;
					case "pop" :
						if (!queue.isEmpty()) {
							bw.write(queue.poll() + "\n");
						} else {
							bw.write("-1" + "\n");
						}
						break;
					case "size" :
						bw.write(queue.size() + "\n");
						break;
					case "empty" :
						if (queue.isEmpty()) {
							bw.write("1" + "\n");
						} else {
							bw.write("0" + "\n");
						}
						break;
					case "front" :
						if (!queue.isEmpty()) {
							bw.write(queue.peek() + "\n");
						} else {
							bw.write("-1" + "\n");
						}
						break;
					case "back" :
						if (!queue.isEmpty()) {
							bw.write(what + "\n");
						} else {
							bw.write("-1" + "\n");
						}
						break;
				}
			}
			
			br.close();
			bw.close();
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
