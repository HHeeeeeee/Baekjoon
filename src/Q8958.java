import java.util.Scanner;
public class Q8958 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();
		
		int sum[] = new int[num];	// ���� ��
		int x = 0;
		
		String quiz[] = new String[num];
		
		for(int i=0; i<num; i++){		// OX �Է¹ޱ�
			quiz[i] = in.next();		// ���⼭ in.nextLine()���� �̻��ϰ� ��.
		}
		
		for(int i=0; i<num; i++){
			for(int j=0; j<quiz[i].length(); j++){
				if(quiz[i].charAt(j) == 'O'){
					++x;	// O�� �������� ���� �� x ���� �����ؾ��ϹǷ� O�� �� x���� ������.
					sum[i] += x;
				}else{
					x = 0;	// X�� ������ �� ���� �����ϸ� �ȵǹǷ� x�� 0���� ����
				}
			}
			x = 0;	// ���ο� OX ���� ���� �޾ƿ;��ϹǷ� x ���� �ʱ�ȭ ������.
		}

		for(int i=0; i<num; i++){
			System.out.println(sum[i]);
		}
		
	}
}

//int sum = 0;



//System.out.println(quiz[0]);
//System.out.println(quiz[1]);


//System.out.println("i"+i);
//System.out.println("j"+j);
//System.out.println("quiz.length"+quiz[i].length());


//System.out.println("O���� - i : "+i+" , j : "+j);

//System.out.println("quiz["+i+"].charAt("+j+") : "+quiz[i].charAt(j));
//System.out.println("sum["+i+"] : "+sum[i]);


/*for(int i=0; i<num; i++){
if(quiz[0].charAt(i) == 'O'){
	//sum[i] += x+1; 
	sum += x+1;
	System.out.println("x : "+x);
}else{
	x = 0;
}
}*/
//System.out.println(x);
//System.out.println(quiz[0].charAt(1));


/*for(int i=0; i<num; i++){
if(quiz[i].charAt(i) == 'O'){
	do{
		sum[i] += 1;
	}while(quiz[i].charAt(i) == quiz[i].charAt(i+1));
}else {
	sum[i] += 0;
}
}
for(int i=0; i<num; i++){
System.out.println(sum[i]);
}*/
/*do{
sum[i] += x+1;
System.out.println("sum[i] : "+ sum[i]);
}while(quiz[i].charAt(j) == 'O');*/
/*if(quiz[i].charAt(j) == 'O'){
sum[i] += x+1;
System.out.println("quiz["+i+"].charAt("+j+") : "+quiz[i].charAt(j));
//System.out.println("sum[i] : "+ sum[i]);
}else{
x = 0;
}*/