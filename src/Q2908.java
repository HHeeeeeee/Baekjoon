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
        
        // 거꾸로 변경된 값을 다시 숫자형으로 변경
        num1 = Integer.parseInt(reverseNum1);
        num2 = Integer.parseInt(reverseNum2);
        
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