// Write a Java program to find if the given number is palindrome or not
package loopspractice;

import java.util.Scanner;

public class Question18whileloop {
	public static void main(String[]args)
	{
		int n,r,rev=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int h=n;
		while(n>0)
		{
			r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		if(h==rev)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
	}
}
