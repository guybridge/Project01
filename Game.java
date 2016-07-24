public class Game
{
 
	public static void main(String[] args)
	{

		System.out.println("Welcome to the guess how many are in the jar game, please enter the following parameters.");

		// Create a prompter object to get the data from the user
		Prompter prompter = new Prompter();
		prompter.setItemType();
		prompter.setMaxAmount();

		System.out.println("");
		System.out.println("****************************");
		System.out.println("|||  LET THE GAME BEGIN  |||");
		System.out.println("****************************");
		System.out.println("");

		// Get the player's name
		prompter.setUserName();

		// Create a jar object
		Jar jar = new Jar(prompter.getItemType(), prompter.getMaxItems());
		System.out.println("The type of item in the jar is " + jar.getItemName());
		System.out.println("The maximum number of " + jar.getItemName() + " in the jar is " + prompter.getMaxItems());

		while (true)
		{
			prompter.setmGuessAmount();
			boolean isCorrect = false;

			try
			{
				isCorrect = jar.applyGuess(prompter.getmGuessAmount());
			}
			catch(IllegalArgumentException e)
			{
				System.out.println("Guess too high: " + e.getMessage());
			}


			if(isCorrect)
			{
				System.out.println("Correct, you won : )");
				System.out.println("You guessed " + jar.getGuessAttempts() + " times.");
				FileHelper helper = new FileHelper();
				helper.save(String.valueOf(prompter.getUserName() + " : " + jar.getGuessAttempts()));
				helper.close();
				System.exit(0);
			}
			else
			{

				// If the guess is less than the real amount, tell them to guess higher
				if (prompter.getmGuessAmount() < jar.getmRealAmount())
				{
					System.out.println("Sorry wrong answer, try guess higher.");
				}
				else if(prompter.getmGuessAmount() > jar.getmRealAmount())
				{
					System.out.println("Sorry wrong answer, try guess lower");
				}
			}
		}

		
		  
	}
  
}
