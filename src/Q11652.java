import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Q11652 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Map<Long, Integer> map = new HashMap<>();
		
		try {
			int count = Integer.parseInt(br.readLine());
			for (int i = 0; i < count; i++) {
				Long num = Long.parseLong(br.readLine());
				if (map.containsKey(num)) {
					map.put(num, map.get(num) + 1);
				} else {
					map.put(num, 1);
				}
			}
		
			List<Map.Entry<Long, Integer>> list = new ArrayList<Map.Entry<Long, Integer>>(map.entrySet());
	        Collections.sort(list, new Comparator<Map.Entry<Long, Integer>>() {
	            public int compare(Map.Entry<Long, Integer> o1, Map.Entry<Long, Integer> o2) {
	                if(o1.getValue() < o2.getValue()) return 1;
	                else if(o1.getValue() > o2.getValue()) return -1;
	                else {
	                    if(o1.getKey() < o2.getKey()) return -1;
	                    else if(o1.getKey() > o2.getKey()) return 1;
	                }
	                return 0;
	            }
	        });
        
	        bw.write(list.get(0).getKey() + "\n");
	        bw.flush();
	        bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

/*	Scanner∑Œ «Æ¿Ã
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = in.nextInt();
		Map<Long, Integer> map = new HashMap<>();
		for (int i = 0; i < count; i++) {
			Long num = in.nextLong();
			if (map.containsKey(num)) {
				map.put(num, map.get(num) + 1);
			} else {
				map.put(num, 1);
			}
		}
		
		List<Map.Entry<Long, Integer>> list = new ArrayList<Map.Entry<Long, Integer>>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Long, Integer>>() {
            public int compare(Map.Entry<Long, Integer> o1, Map.Entry<Long, Integer> o2) {
                if(o1.getValue() < o2.getValue()) return 1;
                else if(o1.getValue() > o2.getValue()) return -1;
                else {
                    if(o1.getKey() < o2.getKey()) return -1;
                    else if(o1.getKey() > o2.getKey()) return 1;
                }
                return 0;
            }
        });
        
        System.out.println(list.get(0).getKey());
	}
}*/