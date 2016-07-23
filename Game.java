import java.io.Console;

public class Game
{
 
	public static void main(String[] args)
	{

		System.out.println("");
		System.out.println("****************************");
		System.out.println("****************************");
		System.out.println("****************************");
		System.out.println("|||  LET THE GAME BEGIN  |||");	
		System.out.println("****************************");
		System.out.println("****************************");
		System.out.println("****************************");
		System.out.println("");

		// Get the item type from the user
		Console console = System.console();
		String itemType = console.readLine("Please enter the type of item in the jar: ");
		int maxItemAmount = Integer.valueOf(console.readLine("Enter the maximum number of " + itemType + " in the jar: "));

		// Create a jar object
		Jar jar = new Jar(itemType, maxItemAmount);
		System.out.println("The type of item in the jar is: " + jar.getItemName());

		while (true)
		{
			int guessAmount = Integer.valueOf(console.readLine("How many " + jar.getItemName() + " do you think are in the jar? :" ));

			boolean isTrue = jar.applyGuess(guessAmount);

			if(isTrue)
			{
				System.out.println("Correct");
				System.exit(0);
			}
			else
			{
				System.out.println("Wrong");
			}
		}

		
		  
	}
  
}
