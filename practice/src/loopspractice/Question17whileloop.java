//Write a program to reverse a given number and print
package loopspractice;
import java.util.*;
public class Question17whileloop {
	public static void main(String[]args)
	{
		int n,r,rev=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		while(n>0)
		{
			r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		System.out.println(rev);
	}

}
