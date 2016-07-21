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

		// Create a jar object
		Jar jar = new Jar(args[0]);
		System.out.println("The type of item in the jar is: " + jar.getItemName());			
		  
	}
  
}
