import java.util.Scanner;
public class hello 
{

	public static void main(String[] args) 
	{
		//Reads in name of user and then prints out the name - Edited by Trevor
		Scanner reader = new Scanner(System.in);
		System.out.print("Please enter your name: ");
		String s = reader.next();
		System.out.println("User: " + s);
		System.out.println("Updated by Evan");
	}

}
