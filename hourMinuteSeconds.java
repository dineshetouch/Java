import java.util.Scanner;

public class hourMinuteSeconds {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the seconds: ");
		
		int second = input.nextInt();
		
		int minute = second/60;
		
		int hour = second/3600;
		
		int sec = hour*60+ minute*60;
		int diff = second - sec;
		System.out.println("diff>>"+diff);
		System.out.println(hour+":"+minute+":"+diff);
		

	}

}
