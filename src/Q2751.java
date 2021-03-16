import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Q2751 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int count;
		try {
			count = Integer.parseInt(br.readLine());
			int arr[] = new int[count];
			
			for (int i = 0; i < count; i++) {
				arr[i] = Integer.parseInt(br.readLine());
			}

			Arrays.sort(arr);
			
			bw.write(Arrays.toString(arr).replace("[", "").replace("]", "").replace(", ", "\n") + "\n");
			
			bw.flush();
			bw.close();
			br.close();
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
