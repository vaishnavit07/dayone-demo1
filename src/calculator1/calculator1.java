package calculator1;
import java.util.Scanner;
public class calculator1 {
	public static void main(String args[]) {
		//read input from keyboard
		//new is used to create the object
		Scanner scan = new Scanner(System.in);
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		int result;
		result=num1+num2;
		System.out.println("the result is" + result);
}
}






//predefined classes: String,System ......always starts with upper class letter