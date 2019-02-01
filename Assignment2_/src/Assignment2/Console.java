package Assignment2;

import java.util.Scanner;
/**
*Develop console class for scanner input
*Input for String, Integer, Double and Char
*/
public class Console 
{
    public static Scanner console = new Scanner(System.in);
    
    public static String askString(String aPrompt) // method for string input
    {
		System.out.print(aPrompt);  // aPrompt is a request for string input
		String reply = console.nextLine(); // input held in a variable called reply
		return reply;
    }
    public static int askInt(String aPrompt)  // method for integer input
    {
		String reply = askString(aPrompt);
		return Integer.parseInt(reply); // parseInt converts string to integer
    }
    public static double askDouble(String aPrompt)  // method for double input
    {
		String reply = askString(aPrompt);
		return Double.parseDouble(reply);  // parseDouble converts string to double
    }
    
 // method for one character input for menu options
    public static char askOption(String aMenu)  
    {
  	  System.out.println(aMenu);
  	  String reply = askString("Enter option: ");
  	  if (reply.trim().length() == 0) // checks for null input
  		  return '\0';
  	  else
  	      // Take first character of string and convert to Uppercase
  		  return Character.toUpperCase(reply.trim().charAt(0)); 
    }
  
 // method for one character input
    public static char askChar(String aChar)  
    {
  	  String reply = askString(aChar);
     // Take first character of string and convert to Uppercase
	  return Character.toUpperCase(reply.trim().charAt(0));
     }
}
