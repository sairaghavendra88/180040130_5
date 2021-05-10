package arrayspractice;
import java.util.Scanner;
public class Question1arrays {
		public static void main(String[] args) 
		{
		  Scanner sc = new Scanner(System.in);
		  int i,s=0,avg;
		  int n=sc.nextInt();
		  int a[]=new int[n];
		  for(i=0;i<n;i++)
		  {
			  a[i]=sc.nextInt();
		  }
		  for(i=0;i<n;i++)
		  {
			  s=s+a[i];
		  }
		  avg=s/n;
		  System.out.println("sum of the array "+s);
		  System.out.println("average of the array"+avg);
		}

	}

