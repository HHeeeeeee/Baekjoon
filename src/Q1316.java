import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Q1316 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = in.nextInt();
		
		String str[] = new String[count];
		for (int i = 0; i < count; i++) {
			str[i] = in.next(); 
		}
		
		int result[] = new int[count];
		int resultCount = 0;
	
		for (int i = 0; i < count; i++) {
			List<String> list = new ArrayList<>();
			list.add(String.valueOf(str[i].charAt(0)));
			result[i] = 0;
			for (int j = 1; j < str[i].length(); j++) {
				char ch = str[i].charAt(j);
				String chToString = String.valueOf(ch);
				
				if (list.contains(chToString)) {	// 이전에 나왔던 문자 -> 문자-1(바로 이전 문자)도 같은 문자인지 체크 
					char ch_1 = str[i].charAt(j-1);
					String ch_1ToString = String.valueOf(ch_1);
					
					if (!(ch_1ToString.equals(chToString))) {	// 이전 문자와 같지 않을 때 -> 그룹 단어 아님
						result[i] = 1;
						continue;
					} 
				} else {	// 처음 나온 문자 -> 리스트에 저장
					list.add(String.valueOf(str[i].charAt(j)));
				}
			}
			
			if (result[i] == 0) {
				resultCount ++;
			}
		}
		
		System.out.println(resultCount);
	}
}