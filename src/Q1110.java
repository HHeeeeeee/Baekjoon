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
			num1 = num/10;	// ���� 10���� ������ ���� ���� �ڸ��� �ǰ�, 
			num2 = num%10;	// ���� 10���� ���� �������� ���� �ڸ��� ��.
			sum = num1 + num2;	// ��
			//System.out.println("num1 : " + num1 + ", num2 : "+ num2 + ", sum :" + sum);
			count++;	
			num1 = num2;	// �ٽ� ���ο� ���ڸ� ����� ���� ���� �ڸ� ���� ���� �ڸ� ���� ��.
			num2 = sum%10;	// sum�� ���ڸ��� ��� ���� �ڸ� ���ڸ� �����;� ������ %10�� ����Ͽ� ���������� �������� ���� �ڸ��� ���� �� ����.
			num = num1*10 + num2;	// ���ο� ���� ���� - num1�� 10�� ���ϸ� ���� �ڸ� ���ڰ� �ǰ� num2�� ���ϸ� ���� �ڸ� ���� �Ǽ� ���� �ڸ� ���ڸ� ���� �� ����. 
		}while(num != in_num);
		
		System.out.println(count);
	}
}



// ���Ҹ��� ���������� �ẽ
/*Scanner in = new Scanner(System.in);
int num = in.nextInt();		// ���� �Է�
int count = 0; 		// ���� ���� ������ ����
String s_num;		// ���ڸ� ���ڷ� ������ ����
s_num = Integer.toString(num);		// ���ڸ� ���ڷ� ��ȯ�ؼ� s_num�� ����
int sum = 0;			// �� �ڸ����� ��
int second;

char c_num[] = new char[s_num.length()];	// ���ڰ� �� ���ڸ� �и��ؼ� �־���� �迭

for(int i=0; i<s_num.length(); i++){
	c_num[i] = s_num.charAt(i);		// ���ڰ� �� ���ڸ� �ϳ��� ����
	sum += (int)c_num[i] - 48;		// �׳� (int)�� �ٿ��ָ� �ƽ�Ű�ڵ�� ����� ��. �׷��� 48�� ���ָ� ���� ���ڰ� ��. 	
	System.out.println("c_num : " + c_num[i]);
	System.out.println("sum : " + sum);
}
count ++;

second = (int)c_num[1] - 48;
System.out.println("second : "+ second);

int new_num = second + sum;		// ���ο� ���� ���� ����� ����
System.out.println("new_num : "+new_num);

count ++;

System.out.println("count : "+count);
//������ �ɾ���� �ݺ������� ��������. 
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