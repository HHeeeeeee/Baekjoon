import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
public class Q5622 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Map<String, Integer> alphabetMap = new HashMap<>();
		int sum = 0;
		
		for (int i = 0; i < 26; i++) {
			char ascii = (char) (65+i);
			String asciiString = String.valueOf(ascii);
			
			switch (65 + i) {
				case 65 : case 66 : case 67:
					alphabetMap.put(asciiString, 3);
					break;
				case 68 : case 69 : case 70:
					alphabetMap.put(asciiString, 4);
					break;
				case 71 : case 72 : case 73:
					alphabetMap.put(asciiString, 5);
					break;
				case 74 : case 75 : case 76:
					alphabetMap.put(asciiString, 6);
					break;
				case 77 : case 78 : case 79:
					alphabetMap.put(asciiString, 7);
					break;
				case 80 : case 81 : case 82: case 83:
					alphabetMap.put(asciiString, 8);
					break;
				case 84 : case 85 : case 86:
					alphabetMap.put(asciiString, 9);
					break;
				case 87 : case 88 : case 89: case 90:
					alphabetMap.put(asciiString, 10);
					break;
			}
		}
		
		String str = br.readLine();
		
		for (int j = 0; j < str.length(); j++) {
			char strChar = str.charAt(j);
			String strString = String.valueOf(strChar);
			
			if (alphabetMap.containsKey(strString)) {
				sum += alphabetMap.get(strString);
			}
		}
		
		bw.write(sum + "\n");
		bw.flush();
		bw.close();
	}
}