import java.util.Scanner;
public class Q2884 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int hour = in.nextInt();
		int minute = in.nextInt();
		int totalMinute = 0;
		int newHour = 0;
		int newMinute = 0;
		
		if ((hour >= 0 || hour < 24) && (minute >= 0 || minute < 60)) {
			if (hour > 0) {
				totalMinute = (hour * 60) + minute - 45;
				newHour = totalMinute / 60;
				newMinute = totalMinute % 60;
			} else {
				if (minute - 45 < 0) {
					totalMinute = (hour * 60) + minute - 45;
					newHour = 23;
					newMinute = totalMinute + 60;
				}
			}
		}
		System.out.println(newHour + " " + newMinute);
	}
}
