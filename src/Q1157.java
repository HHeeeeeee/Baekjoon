import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Q1157 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String str = in.nextLine();
		str = str.toUpperCase();

		Map<String, Integer> resultMap = new HashMap<>();
		
		for (int i = 0; i < str.length(); i++) {
			char strOneChar = str.charAt(i);
			String strOneString = String.valueOf(strOneChar);
			
			if (resultMap.containsKey(strOneString)) {
				resultMap.computeIfPresent(String.valueOf(strOneChar), (k, v) -> v + 1);
            } else {
            	resultMap.put(strOneString, 1);
            }
		}
		
		int max = 0;
		String resultStr = "";
		
		for (String key : resultMap.keySet()) {
			int value = resultMap.get(key);
			
			if (value > max) {
				max = value;
				resultStr = key;
			} else if (value == max) {
				resultStr = "?";
			}
		}
		
		System.out.println(resultStr);
	}
}