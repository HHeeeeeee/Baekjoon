import java.util.Scanner;
public class Q2675 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = in.nextInt();		// �� ���� �Է¹�������
		int repeat[] = new int[count];	// �ݺ��� Ƚ��
		String str[] = new String[count];	// �ݺ��� ���ڿ�	
		for(int i=0; i<count; i++){
			repeat[i] = in.nextInt();
			str[i] = in.next();
		}
		for(int i=0; i<count; i++){
			for(int j=0; j<str[i].length(); j++){	// �ݺ��� ���ڿ��� ���̸�ŭ
				for(int k=0; k<repeat[i]; k++){  // �ݺ��� Ƚ����ŭ
					System.out.print(str[i].charAt(j));	  // �ݺ��ؼ� ���
				}
			}
			System.out.println();
		}
	}
}
