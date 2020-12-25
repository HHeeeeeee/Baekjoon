import java.util.Scanner;
public class Q2839 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int result = 0;
		
		while (true) {
			if ((n % 5) == 0) {
				result += n / 5;
				break;
			}
			if (n < 3) {
				result = -1;
				break;
			}
			n -= 3;
			result ++;
		}
		
		System.out.println(result);
	}
}



/*import java.util.Scanner;
public class Q2839 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();	//11
		
		int result;
		
		switch(n%5){
			case 0:
				if(n<5){
					result = -1;
				}else{
					result = n/5;
				}
				break;
			
			case 1:
				if(n<5){
					result = -1;
				}else{
					result = (n/5)-1 + ((n%5)+5)/3;
				}
				break;
				
			case 2:
				if(n<10){
					result = -1;
				}else{
					result = (n/5)-2 + ((n%5)+10)/3;
				}
				break;
			
			case 3:
				if(n<5){
					result = 1;
				}else{
					result = (n/5) + (n%5)/3;
				}
				break;
		
			case 4:
				if(n<5){
					result = -1;
				}else{
					result = (n/5)-1 + (((n%5)+5)/3);
				}
		        break;
		
		    default:
		    	result = -1;
		    	break;
		}
		
		System.out.println(result);
	}
}
*/