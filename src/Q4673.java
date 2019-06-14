import java.util.ArrayList;
import java.util.List;

public class Q4673 {
	// #. �Լ� ���� - d(n)�� n�� n�� �� �ڸ����� ���ϴ� �Լ�
	private static void findSelfNum() {
		// �����ڰ� �ִ� ��� list�� �߰�
		List<Integer> list = new ArrayList<Integer>();
		
		// n�� 1 ~ 10000
		for (int i = 1; i < 10000; i++) {
			// �ش� i���� �� �ڸ����� �����ֱ� ���� ���ڷ� �� ��ȯ �� �� �ڸ����� ����. 
			String strNum = Integer.toString(i);
			// �� �ڸ��� ������ ���� ������ ���� - i ���� ���ؾ� �ϹǷ� �ʱⰪ�� i�� ����
			int add = i;
			
			// �� �ڸ����� ���ϱ� ���� for�� �ȿ��� ó��
			for (int j = 0; j < strNum.length(); j++) {
				// �� �ڸ����� ���ڸ� ��� ���� char������ �� �ڸ����� ����.
				char str = strNum.charAt(j);
				// char���� int������ ����ȯ
				int num = (int) str - 48;
				// �� �ڸ��� ����
				add += num;
			}
			
			System.out.println("i : " + i + "�� �� add : " + add);
			
			list.add(add);
			
			System.out.println("list.size() : " + list.size());
			System.out.println(list.get(i-1));
		}
		
		for (int i = 1; i < 10000; i++) {
			// list�� i���� ���ԵǾ� ���� ������ ���� �ѹ� -> �� ���
			if (!(list.contains(i))) {
				System.out.println(i + "���� ��");
			}
		}
	}
	
	public static void main(String[] args) {
		findSelfNum();
	}
}

// ����
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



// �ε��� ���� ��������ϱ� ������ -1�� ����. 
//list.add(add);
//list.remove(add);


//1~10000������ ���ڸ� �Է��� List
		/*List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i < 10000; i++) {
			list.add(i);
		}
		
		// d(n)�� n�� n�� �� �ڸ����� ���ϱ�  ex) d(75) = 75+7+5 = 87
		for (int i = 1; i < 10000; i++) {
			// �� �ڸ����� �ִ� ���ڸ� ���ϱ� ���ؼ� ���ڷ� ����ȯ
			String strNum = Integer.toString(i);
			// �� �ڸ����� ���ϱ� ���� for�� �ȿ��� ó��
			int add = i;
			for (int j = 0; j < strNum.length(); j++) {
				// �� �ڸ����� ���ڸ� ��� ���� char������ �� �ڸ����� ����.
				char str = strNum.charAt(j);
				// char���� int������ ��ȯ�ؼ� �����ֱ� https://m.blog.naver.com/PostView.nhn?blogId=ktwforce&logNo=70106537418&proxyReferer=https%3A%2F%2Fwww.google.co.kr%2F
				int num = (int) str - 48;
				add += num;
			}
		}*/
		
		// Test case


/*String j = Integer.toString(i);
String index = Integer.toString(list.get(i));
System.out.println("j : " + j + ", index : " + index);

if (!(j.equals(index))) {
	System.out.println("�����ѹ� : " + j);
}*/

/*int num = (int) list.get(i);
System.out.println("i (num): " + i + ", list.get(i) : " + list.get(i));*/
// list�� �ִ� ���̶� i�� ���� ���� ������ -> ���� �ѹ�
/*if (list.get(i).) {
	System.out.println("i (num): " + i + ", selfNumber : " + i);
}*/
/*if (list.contains(i)) {
	System.out.println("i (num): " + i + ", selfNumber : " + i);
}*/





/*
���� ó���� �õ��ߴ� ��� 
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