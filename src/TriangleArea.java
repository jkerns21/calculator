import java.util.Scanner;

public class TriangleArea 
{

	public static void main(String[]args)
	{
		
		Scanner keyboard  =  new Scanner(System.in);
		System.out.println("Please enter your name: ");
		String name = keyboard.nextLine();
		System.out.println("");
		
		System.out.println("Please enter the base of the triangle: ");
		String base = keyboard.nextLine();
		System.out.println("Please enter the height of the triangle");
		String height = keyboard.nextLine();
		System.out.println("Please enter the unit that the area will be calculated in: ");
		String units = keyboard.nextLine();
		int baseVar;
		int heightVar;
		int unit;
		baseVar = Integer.parseInt(base);
		heightVar = Integer.parseInt(height);
		unit = Integer.parseInt(units);
		baseVar /= 2;
		baseVar = baseVar * heightVar;
		System.out.println("\n\n\nThe area of the triangle is: " + baseVar+ unit);
	}
}
