import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Q10809 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		String str = br.readLine();
		int count = 0;	// ¾ËÆÄºª ¼ø¼­
		
		Map<String, Integer> resultMap = new HashMap<>();
		for (int i = 0; i < 26; i++) {
			char ascii = (char) (97+i);
			resultMap.put(String.valueOf(ascii), -1);
		}
		
		for (int j = 0; j < str.length(); j++) {
			char strChar = str.charAt(j);
			String strString = String.valueOf(strChar);

			if (resultMap.containsKey(strString)) {
				int value = resultMap.get(strString);
				if (value == -1) {
					value = count;
					resultMap.put(strString, value);
				}
			}
			
			count ++;
		}
		
		for(String key : resultMap.keySet()){
            int value = resultMap.get(key);
            bw.write(value + " ");
        }
		
		bw.flush();
		bw.close();
	}	
}