import java.util.Scanner;
public class AgeInFiveYears {
	public static void main (String args[]){
		// Input
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Hello. What is your name?");
		String name = keyboard.nextLine();
		System.out.println("Hello, " + name + "! How old are you?");
		int age = keyboard.nextInt();
		// Formulas
		int ageplus = age + 5;
		int ageago = age - 5;
		// Output
		System.out.println("Did you know that in five years you will be " + ageplus + " years old?");
		System.out.println("And five years ago you were " + ageago + "! Imagine that!");
	}
}