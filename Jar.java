public class Jar
{
	// Fields
	private String mItem;
	private int mMaxAmount;
	private int mRealAmount;

	// Our constructor which we will init the type of items in the jar
	public Jar(String item, int maxAmount)
	{
		mItem = item;
		mMaxAmount = maxAmount;

		mRealAmount = Utils.getRandomNumber(mMaxAmount);

	}

	public String getItemName()
	{
		return mItem;
	}

	public boolean applyGuess(int guess)
	{
		if(mRealAmount == guess)
		{
			return true;
		}
		else
		{
			return false;
		}

	}

}
