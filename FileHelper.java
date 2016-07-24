import java.io.*;

/**
 * Created by guyb on 24/07/16.
 */
public class FileHelper
{
    public static final String MAX_SCORES = "MAX_SCORE.txt";
    PrintWriter mWriter;

    public FileHelper()
    {
        try
        {

            PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(MAX_SCORES, true)));
            mWriter  = writer;
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (UnsupportedEncodingException e)
        {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void save(String data)
    {
        mWriter.append(data + "\n");
    }

    public void close()
    {
        mWriter.close();
    }




}
