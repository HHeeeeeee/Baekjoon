import java.util.Scanner;
public class Q2908 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // ���� �Է¹ޱ�
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        // �Է¹��� ���� ���ڷ� ����
        String strNum1 = Integer.toString(num1);
        String strNum2 = Integer.toString(num2);
        // �Ųٷ� ����� ���� ������ ����
        String reverseNum1 = "";
        String reverseNum2 = "";
        
        // ���ڷ� ����� ���� �Ųٷ� ����
        for (int i = strNum1.length()-1; i >= 0; i--) {
            reverseNum1 += strNum1.charAt(i);
        }
        for (int i = strNum2.length()-1; i >= 0; i--) {
            reverseNum2 += strNum2.charAt(i);
        }
        
        // �Ųٷ� ����� ���� �ٽ� ���������� ����
        num1 = Integer.parseInt(reverseNum1);
        num2 = Integer.parseInt(reverseNum2);
        
        // ���� ��
        if (num1 > num2) {
            System.out.println(num1);
        } else if (num2 > num1) {
            System.out.println(num2);
        } else {
            System.out.println(num1);
        }
    }
}