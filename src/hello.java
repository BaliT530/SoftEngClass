import java.util.Scanner;
public class hello 
{

	public static void main(String[] args) 
	{
		//Reads in the name of the user
		Scanner reader = new Scanner(System.in);
		System.out.print("Please enter your name: ");
		String s = reader.next();
		System.out.println("User: " + s);
	}

}
