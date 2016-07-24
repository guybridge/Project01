public class Jar
{
	// Fields
	private String mItem;
	private int mMaxAmount;
	private int mRealAmount;
	private int mGuessAttempts;

	// Our constructor which we will init the type of items in the jar
	public Jar(String item, int maxAmount)
	{
		mItem = item;
		mMaxAmount = maxAmount;
		// Generate a random number once we create the instance
		mRealAmount = Utils.getRandomNumber(mMaxAmount);

	}

	public String getItemName()
	{
		return mItem;
	}

	public boolean applyGuess(int guess)
	{
		// Increment guess counter;
		mGuessAttempts++;

		if(guess > mMaxAmount)
		{
			throw new IllegalArgumentException("Error: guess is higher than the maximum");
		}

		if(mRealAmount == guess && validateGuess(guess, mMaxAmount))
		{
			return true;
		}

		else
		{
			return false;
		}

	}

	public int getmRealAmount()
	{
		return mRealAmount;
	}

	public boolean validateGuess(int guess, int max)
	{
		if(guess > 0 && guess <= max)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public int getGuessAttempts()
	{
		return mGuessAttempts;
	}

}
