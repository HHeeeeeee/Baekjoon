import java.util.Scanner;
public class Q11720 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        
		int count = in.nextInt();
		String num = in.next();
		int sum = 0;
		
		for(int i=0; i<count; i++){
			sum += (num.charAt(i)-'0');
		}
		System.out.println(sum);
		
        /*
        Scanner in = new Scanner(System.in);
        int length = Integer.parseInt(in.nextLine());
        String number = in.nextLine();
        int sum = 0;
        
        for(int i=1; i<=length; i++){
            sum = sum + (number.charAt(i-1)-'0');
        }
        
        System.out.println(sum);*/
		
		
		/*
		 * 이클립스에선 잘 돌아가는데 컴파일 에러 남....
		Scanner in = new Scanner(System.in);
		
		int count = in.nextInt();
		int sum = 0;
		
		for(int i=0; i<count; i++){
			int num = in.nextInt();
			sum += num;
		}
		System.out.println(sum);*/
	}

}
