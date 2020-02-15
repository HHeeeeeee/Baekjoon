import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Q10808 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
				
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 97; i <= 122; i++) {
            map.put(i, 0);
        }
        
        String str;
		try {
			str = br.readLine();
			
			for (int j = 0; j < str.length(); j++) {
	            char ch = str.charAt(j);
	            map.put((int)ch, map.get((int)ch)+1);
	        }
	        
	        Iterator<Integer> iter = map.keySet().iterator();
	        while(iter.hasNext()) {
	            int key = iter.next();
	            bw.write(map.get(key) + " ");
	        }
	        
	        br.close();
	        bw.flush();
	        bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

/*import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

public class Q10808 {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 97; i <= 122; i++) {
            map.put(i, 0);
        }
        
        String str = in.nextLine();
        
        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);
            map.put((int)ch, map.get((int)ch)+1);
        }
        
        Iterator<Integer> iter = map.keySet().iterator();
        while(iter.hasNext()) {
            int key = iter.next();
            System.out.print(map.get(key) + " ");
        }
        
        in.close();
	}
}*/
