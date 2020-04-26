import java.util.Scanner;
public class Q5543 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int burger[] = new int[3];
		int beverage[] = new int[2];
		int choiceBurger = 2000;
		int choiceBeverage = 2000;
		
		for (int i = 0; i < burger.length; i ++) {
			burger[i] = in.nextInt();
			if (choiceBurger > burger[i]) {
				choiceBurger = burger[i];
			}
		}
		
		for (int j = 0; j < beverage.length; j ++) {
			beverage[j] = in.nextInt();
			if (choiceBeverage > beverage[j]) {
				choiceBeverage = beverage[j];
			}
		}
		
		System.out.println((choiceBurger + choiceBeverage) - 50);
	}
}
