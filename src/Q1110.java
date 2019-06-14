import java.util.Scanner;
public class Q1110 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int in_num = in.nextInt();
		int num = 0;
		int count = 0;
		int num1, num2, sum;
		
		num = in_num;
		
		do{
			num1 = num/10;	// 수를 10으로 나누면 몫이 십의 자리가 되고, 
			num2 = num%10;	// 수를 10으로 나눈 나머지가 일의 자리가 됨.
			sum = num1 + num2;	// 합
			//System.out.println("num1 : " + num1 + ", num2 : "+ num2 + ", sum :" + sum);
			count++;	
			num1 = num2;	// 다시 새로운 숫자를 만들기 위해 일의 자리 수가 십의 자리 수가 됨.
			num2 = sum%10;	// sum이 두자리일 경우 일의 자리 숫자를 가져와야 함으로 %10을 사용하여 나머지값을 가져오면 일의 자리를 취할 수 있음.
			num = num1*10 + num2;	// 새로운 숫자 조합 - num1에 10을 곱하면 십의 자리 숫자가 되고 num2를 더하면 일의 자리 수가 되서 십의 자리 숫자를 만들 수 있음. 
		}while(num != in_num);
		
		System.out.println(count);
	}
}



// 개소리를 정성스럽게 써봄
/*Scanner in = new Scanner(System.in);
int num = in.nextInt();		// 숫자 입력
int count = 0; 		// 숫자 개수 저장할 변수
String s_num;		// 숫자를 문자로 저장할 변수
s_num = Integer.toString(num);		// 숫자를 문자로 변환해서 s_num에 저장
int sum = 0;			// 각 자릿수의 합
int second;

char c_num[] = new char[s_num.length()];	// 문자가 된 숫자를 분리해서 넣어놓을 배열

for(int i=0; i<s_num.length(); i++){
	c_num[i] = s_num.charAt(i);		// 문자가 된 숫자를 하나씩 분해
	sum += (int)c_num[i] - 48;		// 그냥 (int)를 붙여주면 아스키코드로 계산이 됨. 그래서 48을 빼주면 원래 숫자가 됨. 	
	System.out.println("c_num : " + c_num[i]);
	System.out.println("sum : " + sum);
}
count ++;

second = (int)c_num[1] - 48;
System.out.println("second : "+ second);

int new_num = second + sum;		// 새로운 숫자 조합 만드는 조합
System.out.println("new_num : "+new_num);

count ++;

System.out.println("count : "+count);
//조건을 걸어놓고 반복문으로 돌려야함. 
if(new_num != num){
	for(int i=0; i<s_num.length(); i++){
		c_num[i] = Integer.toString(new_num).charAt(i);
		System.out.println("c_num[i]" + c_num[i]);
	}
}else{
	System.out.println(count);
}
*/








//s_num = (String)num;

/*char c_num[] = new char[s_num.length()];

for(int i=0; i<s_num.length(); i++){
	c_num[i] = s_num.charAt(i);
//	sum += Integer.parseInt(c_num[i]);
	
	//sum += 
			//(int)c_num[i];
	System.out.println("c_num : "+ c_num[i]);
	//System.out.println("sum : "+ sum);
}*/

/*for(int i=0; i<s_num.length(); i++){
	int sum = (int)(c_num[i] + c_num[i+1]);
	System.out.println(sum);
}*/

//if(s_num)