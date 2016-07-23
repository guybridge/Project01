import java.util.Random;

/**
 * Created by guyb on 23/07/16.
 */
public class Utils
{
    // Method to generate a random number
    // Returns an int between 0 and the max input
    public static int getRandomNumber(int max)
    {
        // Create an instance of the random class
        Random random = new Random();
        int randomNumber = random.nextInt(max);

        return randomNumber;

    }
}
