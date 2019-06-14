import java.util.Scanner;
public class Q2908 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// 숫자 입력받기
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		
		// 입력받은 숫자 문자로 변경
		String strNum1 = Integer.toString(num1);
		String strNum2 = Integer.toString(num2);
				
		// 거꾸로 변경된 문자 저장할 변수
		String reverseNum1 = "";
		String reverseNum2 = "";
		
		// 문자로 변경된 값을 거꾸로 변경
		for (int i = strNum1.length()-1; i >= 0; i--) {
			reverseNum1 += strNum1.charAt(i);
		}
		
		for (int i = strNum2.length()-1; i >= 0; i--) {
			reverseNum2 += strNum2.charAt(i);
		}
		
		System.out.println("reverseNum1 : " + reverseNum1);
		System.out.println("reverseNum2 : " + reverseNum2);
		
		// 거꾸로 변경된 값을 다시 숫자형으로 변경
		num1 = Integer.parseInt(reverseNum1);
		num2 = Integer.parseInt(reverseNum2);
		
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		
		// 숫자 비교
		if (num1 > num2) {
			System.out.println(num1);
		} else if (num2 > num1) {
			System.out.println(num2);
		} else {
			System.out.println(num1);
		}
	}
}

/*String num1 = in.next();
String num2 = in.next();
String str1 = null;
String str2 = null;

for(int i = num1.length(); i <= 0; i--) {
	str1 += num1.substring(i);
	System.out.println(str1);
}
for(int i = num2.length(); i <= 0; i--) {
	str2 += num2.substring(i);
}*/

//String a = in.next();
//String b = in.next();




/*String newA = "";
String newB = "";



for(int i=2; i<=0; i++){
	newA += a.charAt(i);
	newB += b.charAt(i);
	//newA.a += a.charAt(i);
	//newA.= a.charAt(i);
}
//System.out.println(newA);
System.out.println(newA);
System.out.println(newB);*/

/* 이렇게 제출했는데 틀렸다고 나옴.
Scanner in = new Scanner(System.in);

int a = in.nextInt();
int b = in.nextInt();

StringBuffer strA = new StringBuffer(Integer.toString(a));
StringBuffer strB = new StringBuffer(Integer.toString(b));

if(a>b){
	System.out.println(strB.reverse());
}else if(a<b){
	System.out.println(strA.reverse());
}*/


/*	StringBuilder newA = new 
String newB = "";*/



/*StringBuffer revA = strA.reverse();
StringBuffer revB = strB.reverse();*/

//int intrevA = (Integer)revA;



//String strA = Integer.toString(a);
//System.out.println(reverseString(strA));



/*import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		int b = in.nextInt();
		
		StringBuffer strA = new StringBuffer(Integer.toString(a));
		StringBuffer strB = new StringBuffer(Integer.toString(b));
	
		if(a>b){
			System.out.println(strB.reverse());
		}else if(a<b){
			System.out.println(strA.reverse());
		}
	}
}*/