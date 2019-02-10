import java.util.Scanner;

public class hourMinuteSeconds {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in); // Scanner class is use to read the input data from keyboard

		System.out.println("Enter the value of seconds: ");

		int totalSecond = s.nextInt(); //enter the value of seconds in console

		int totalMinute = 0, hour = 0; //initializing the variable

		if (totalSecond > 60) {	//if the value of total second >60 then it will go in if block and give the total minute

			totalMinute = totalSecond / 60;

			System.out.println("Total minute >> " + totalMinute);

		}
		if (totalMinute > 60) { //if the value of total minute >60 then it will go in if block and give the total hour

			hour = totalMinute / 60;
			System.out.println("hour >> " + hour);
		}

		int minute = totalMinute - hour * 60; //give the exact minute
		System.out.println("minute >> " + minute);

		int second = totalSecond - totalMinute * 60; //give the exact seconds
		System.out.println("seconds >> " + second);

		System.out.println(hour + ":" + minute + ":" + second);

	}

}
