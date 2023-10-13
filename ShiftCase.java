import java.util.Scanner;

	public class ShiftCase 
	{
	    public static void main(String[] args) 
		{
	        Scanner scanner = new Scanner(System.in);

	        // Prompt the user for input
	        System.out.println("Enter a string: ");
	        String input = scanner.nextLine();

	        // Initialize variables to store the modified string
	        StringBuilder modifiedString = new StringBuilder();

	        for (int i = 0; i < input.length(); i++) 
			{
	            char currentChar = input.charAt(i);

	            // Check if the character is an uppercase letter
	            if (Character.isUpperCase(currentChar)) 
				{
	                char shiftedChar = (char) (currentChar - 2);

	                
	                modifiedString.append(shiftedChar);
	            }
	            // Check if the character is a lowercase letter
	            else if (Character.isLowerCase(currentChar)) 
				{
	                char shiftedChar = (char) (currentChar - 3);

	                modifiedString.append(shiftedChar);
	            }
	            // If the character is not a letter, append it as is
	            else 
				{
	                modifiedString.append(currentChar);
	            }
	        }

	        // Print the modified string
	        System.out.println("Modified string: " + modifiedString.toString());

	       
	    }
	}