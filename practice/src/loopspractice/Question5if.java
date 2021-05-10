// Initialize a character variable in a program and print 'Alphabhet' if the initialized value is an alphabhet, print 'Digit' if the initialized value is a number, and print 'Special Character', if the initialized value is anything else.

package loopspractice;

import java.util.*;
public class Question5if {
	public static void main(String[]args)
	{
	Scanner sc=new Scanner(System.in);
    char char1 =sc.next().charAt(0);
    if((char1>=48 && char1<=57) || char1 == 45)
    {
        System.out.print("char is Digit");

    }
    else if((char1>='a' && char1<='z')||(char1>='A' && char1<='Z'))
    {
        System.out.print("char is Alphabet");
    }
    else
    {
        System.out.print("char is special character");
    }
}
    
}
