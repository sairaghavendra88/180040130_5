//Write a program to print the sum of all the digits of a given number
package loopspractice;
import java.util.*;
public class Question15forloop {
	public static void main(String[]args)
	{
	int m,r,sum=0;
	Scanner sc=new Scanner(System.in);
    m=sc.nextInt();
    while(m>0)
    {
    	r=m%10;
    	sum=sum+r;
    	m=m/10;
    }
    System.out.println(sum);
}
}
