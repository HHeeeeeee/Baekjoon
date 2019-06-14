import java.util.Arrays;
import java.util.Scanner;
public class Q2920 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	
		int[] num = new int[8];
		
		for(int i=0; i<8; i++){
			num[i] = in.nextInt();
		}
		
		String result = "";
		
		int ascending[] = new int[8];
		int descending[] = new int[8];
		
		for(int i=0; i<8; i++){
			ascending[i] = i+1;
		}
		
		for(int i=0; i<8; i++){
			descending[i] = 8-i;
		}
		
		if(Arrays.equals(num, ascending)){
			result = "ascending";
		}else if(Arrays.equals(num, descending)){
			result = "descending";
		}else{
			result = "mixed";
		}
		
		System.out.println(result);
	}

}


// ascending descending mixed
/*for(int i=7; i>=0; i--){
descending[i] = i+1;
//System.out.println("descending["+i+"]"+descending[i]);
}*/
//System.out.println(descending[0]);

/*for(int i=0; i<8; i++){
if(num[i] == ascending[i]){
	result = "ascending";
}else if(num[i] == descending[i]){
	result = "descending";
}else {
	result = "mixed";
}
}*/	

/*  시도했다가 틀린 문제 -> mixed가 실행이 안됨

		Scanner in = new Scanner(System.in);
		int[] num = new int[8];
		
		for(int i=0; i<8; i++){
			num[i] = in.nextInt();
		}
		
		int ascending[] = {1, 2, 3, 4, 5, 6, 7, 8};
		int descending[] = {8, 7, 6, 5, 4, 3, 2, 1};

		for(int i=0; i<8; i++){
			if(num[i] == ascending[i]){
				System.out.println("ascending");
				break;
			}else if(num[i] == descending[i]){
				System.out.println("descending");
				break;
			}else {
				System.out.println("mixed");
				break;
			}
		}	



*/