import java.io.Console;
import java.util.IllegalFormatCodePointException;

/**
 * Created by guyb on 24/07/16.
 */
public class Prompter
{
    private String mItemType;
    private int mMaxItems;
    private int mGuessAmount;
    private String mUserName;


    public void setItemType()
    {
        Console console = System.console();
        mItemType = console.readLine("Please enter the type of item in the jar: ");

        if(mItemType.equals(""))
        {
            throw new IllegalArgumentException("Error: Item cannot be null");
        }
    }

    public void setMaxAmount()
    {
        Console console = System.console();
        mMaxItems = Integer.valueOf(console.readLine("Enter the maximum number of " + mItemType + " in the jar: "));

        if(mMaxItems <= 0)
        {
            throw new IllegalArgumentException("Error: Max amount cannot be 0 or negative");
        }
    }

    public void setmGuessAmount()
    {
        Console console = System.console();
        mGuessAmount = Integer.valueOf(console.readLine("How many " + mItemType + " do you think are in the jar? :" ));

    }

    public void setUserName()
    {
        Console console = System.console();
        mUserName = console.readLine("Please enter your name: ");
    }

    public String getUserName()
    {
        return mUserName;
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
