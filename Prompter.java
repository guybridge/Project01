import java.io.Console;

/**
 * Created by guyb on 24/07/16.
 */
public class Prompter
{
    private String mItemType;
    private int mMaxItems;
    private int mGuessAmount;


    public void setItemType()
    {
        Console console = System.console();
        mItemType =  console.readLine("Please enter the type of item in the jar: ");
    }

    public void setMaxAmount()
    {
        Console console = System.console();
        mMaxItems = Integer.valueOf(console.readLine("Enter the maximum number of " + mItemType + " in the jar: "));
    }

    public void setmGuessAmount()
    {
        Console console = System.console();
        mGuessAmount = Integer.valueOf(console.readLine("How many " + mItemType + " do you think are in the jar? :" ));
    }

    public String getItemType()
    {
        return mItemType;
    }

    public int getMaxItems()
    {
        return mMaxItems;
    }

    public int getmGuessAmount()
    {
        return mGuessAmount;
    }

}
