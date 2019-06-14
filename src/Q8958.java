import java.util.Scanner;
public class Q8958 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();
		
		int sum[] = new int[num];	// 점수 합
		int x = 0;
		
		String quiz[] = new String[num];
		
		for(int i=0; i<num; i++){		// OX 입력받기
			quiz[i] = in.next();		// 여기서 in.nextLine()쓰면 이상하게 됨.
		}
		
		for(int i=0; i<num; i++){
			for(int j=0; j<quiz[i].length(); j++){
				if(quiz[i].charAt(j) == 'O'){
					++x;	// O가 연속으로 나올 때 x 값이 증가해야하므로 O일 때 x값을 증가함.
					sum[i] += x;
				}else{
					x = 0;	// X가 나왔을 때 값이 증가하면 안되므로 x는 0으로 설정
				}
			}
			x = 0;	// 새로운 OX 값의 합을 받아와야하므로 x 값을 초기화 시켜줌.
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


//System.out.println("O나옴 - i : "+i+" , j : "+j);

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