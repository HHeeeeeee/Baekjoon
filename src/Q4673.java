import java.util.ArrayList;
import java.util.List;

public class Q4673 {
	// #. 함수 생성 - d(n)을 n과 n의 각 자리수를 더하는 함수
	private static void findSelfNum() {
		// 생성자가 있는 경우 list에 추가
		List<Integer> list = new ArrayList<Integer>();
		
		// n은 1 ~ 10000
		for (int i = 1; i < 10000; i++) {
			// 해당 i값의 각 자리수를 더해주기 위해 문자로 형 변환 후 각 자리수를 구함. 
			String strNum = Integer.toString(i);
			// 각 자리수 덧셈한 값을 저장할 변수 - i 값도 더해야 하므로 초기값을 i로 지정
			int add = i;
			
			// 각 자리수를 더하기 위해 for문 안에서 처리
			for (int j = 0; j < strNum.length(); j++) {
				// 각 자리수의 숫자를 얻기 위해 char형으로 각 자리수를 얻어옴.
				char str = strNum.charAt(j);
				// char형을 int형으로 형변환
				int num = (int) str - 48;
				// 각 자리수 덧셈
				add += num;
			}
			
			System.out.println("i : " + i + "일 때 add : " + add);
			
			list.add(add);
			
			System.out.println("list.size() : " + list.size());
			System.out.println(list.get(i-1));
		}
		
		for (int i = 1; i < 10000; i++) {
			// list에 i값이 포함되어 있지 않으면 셀프 넘버 -> 값 출력
			if (!(list.contains(i))) {
				System.out.println(i + "없는 값");
			}
		}
	}
	
	public static void main(String[] args) {
		findSelfNum();
	}
}

// 제출
/*import java.util.ArrayList;
import java.util.List;

public class Q4673 {
	private static void findSelfNum() {
		List<Integer> list = new ArrayList<Integer>();
		
		for (int i = 1; i < 10000; i++) {
			String strNum = Integer.toString(i);
			int add = i;
			
			for (int j = 0; j < strNum.length(); j++) {
				char str = strNum.charAt(j);
				int num = (int) str - 48;
				add += num;
			}
			list.add(add);
		}
		
		for (int i = 1; i < 10000; i++) {
			if (!(list.contains(i))) {
				System.out.println(i);
			}
		}
	}
	
	public static void main(String[] args) {
		findSelfNum();
	}
}*/



/*for (int i = 0; i < 10; i++) {
list.add(i);
System.out.println("i : " + i + ", list.get(i) : " + list.get(i));
}*/
//System.out.println("list.size() : " + list.size());



// 인덱스 값을 지워줘야하기 때문에 -1울 해줌. 
//list.add(add);
//list.remove(add);


//1~10000까지의 숫자를 입력할 List
		/*List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i < 10000; i++) {
			list.add(i);
		}
		
		// d(n)을 n과 n의 각 자리수를 더하기  ex) d(75) = 75+7+5 = 87
		for (int i = 1; i < 10000; i++) {
			// 각 자리수에 있는 숫자를 더하기 위해서 문자로 형변환
			String strNum = Integer.toString(i);
			// 각 자리수를 더하기 위해 for문 안에서 처리
			int add = i;
			for (int j = 0; j < strNum.length(); j++) {
				// 각 자리수의 숫자를 얻기 위해 char형으로 각 자리수를 얻어옴.
				char str = strNum.charAt(j);
				// char형을 int형으로 변환해서 더해주기 https://m.blog.naver.com/PostView.nhn?blogId=ktwforce&logNo=70106537418&proxyReferer=https%3A%2F%2Fwww.google.co.kr%2F
				int num = (int) str - 48;
				add += num;
			}
		}*/
		
		// Test case


/*String j = Integer.toString(i);
String index = Integer.toString(list.get(i));
System.out.println("j : " + j + ", index : " + index);

if (!(j.equals(index))) {
	System.out.println("셀프넘버 : " + j);
}*/

/*int num = (int) list.get(i);
System.out.println("i (num): " + i + ", list.get(i) : " + list.get(i));*/
// list에 있는 값이랑 i랑 같은 값이 없으면 -> 셀프 넘버
/*if (list.get(i).) {
	System.out.println("i (num): " + i + ", selfNumber : " + i);
}*/
/*if (list.contains(i)) {
	System.out.println("i (num): " + i + ", selfNumber : " + i);
}*/





/*
완전 처음에 시도했던 방법 
for(int i=1; i<10000; i++){
	int sum =0;
	String sNum = Integer.toString(i);
	sum = i;
	for(int j=0; j<sNum.length(); j++){
		sum += (int)sNum.charAt(j);				
	}
}

}

public static void main(String[] args) {
Q4673 main = new Q4673();
main.selfNum();
}*/