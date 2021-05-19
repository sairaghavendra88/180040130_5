package stringspractice;
import java.util.*;
public class Question10Strings {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int k=str.length();
		int n=sc.nextInt();
		int i=n;
		while(n>0)
		{
			System.out.print(str.substring(k-i,k));
			n--;
		}
	}
	
}
