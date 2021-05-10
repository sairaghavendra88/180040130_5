// Initialize a character variable with an alphabhet in a program.

//If the character value is in lowercase, the output should be displayed in uppercase in the following format.

package loopspractice;
import java.util.*;
public class Question7if {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		if(Character.isUpperCase(ch)==true)
		{
			System.out.println(Character.toLowerCase(ch));
		}
		else
		{
			System.out.println(Character.toUpperCase(ch));
		}
		
	}

}
