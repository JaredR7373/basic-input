import java.util.Scanner;

public class basicInput
{
	public static void main(String[] args)
	{
		String name;

		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter you name: ");
		name = keyboard.nextLine();

		keyboard.close();

		System.out.println("Hello, " + name);
	}
}
