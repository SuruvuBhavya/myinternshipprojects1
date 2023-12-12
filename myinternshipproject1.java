package testpackage;
import java.util.Scanner;

public class myinternshipproject {
	public static void main(String[] args) {
		Scanner user_input=new Scanner(System.in);
		float f;
		double cel;
		System.out.print("Enter Temperature in Fahrenheit:");
		f=user_input.nextFloat();
		cel=(f-32)/1.8;
		System.out.print("\nFahrenhit is :"+f);
		System.out.print("\nCelcius is :"+cel);
		
	}

}
