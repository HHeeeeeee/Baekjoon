import java.util.Scanner;
public class Q2577 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		
		int count[] = new int[10];

		for(int i=0; i<=9; i++){
			count[i] = 0;
		}
		
		int mul = a*b*c;
		
		String strMul = Integer.toString(mul);	// 숫자를 문자로 변환함. 
		
		//System.out.println("mul : "+mul);
		//System.out.println("strMul : "+strMul);
		
		char num;
		
		//System.out.println(mul);
		
		for(int i=0; i<strMul.length(); i++){
			num = strMul.charAt(i);		// 각각 한 자리씩 추출함. 
			
			//num = strMul.substring(i,1);
			if(num=='0'){
				count[0]++;
			}else if(num=='1'){
				count[1]++;
			}else if(num=='2'){
				count[2]++;
			}else if(num=='3'){
				count[3]++;
			}else if(num=='4'){
				count[4]++;
			}else if(num=='5'){
				count[5]++;
			}else if(num=='6'){
				count[6]++;
			}else if(num=='7'){
				count[7]++;
			}else if(num=='8'){
				count[8]++;
			}else{
				count[9]++;
			}
		}
		
		for(int i=0; i<=9; i++){
			System.out.println(count[i]);
		}
		
	}

}

/*if(mul/10 == 0){
count[0] = 0;
}else if(mul/10 == 1){
count[1] = 1;
}else if(mul/10 == 2){
count[2] = 2;
}else if(mul/10 == 3){
count[3] = 3;
}else if(mul/10 == 4){
count[4] = 4;
}else if(mul/10 == 5){
count[5] = 5;
}else if(mul/10 == 6){
count[6] = 6;
}else if(mul/10 == 7){
count[7] = 7;
}else if(mul/10 == 8){
count[8] = 8;
}else if(mul/10 == 9){
count[9] = 9;
}*/

/*for(int i=0; i<=9; i++){	
//count[i] = mul / 10;
//System.out.println(count[i]);
if(mul/10 == i){
	count[i] = i+1;
}
System.out.println(count[i]);
}*/
