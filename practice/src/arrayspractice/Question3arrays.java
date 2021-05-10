package arrayspractice;
import java.util.Scanner;
public class Question3arrays {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		  int i;
		  int n=sc.nextInt();
		  int a[]=new int[n];
		  for(i=0;i<n;i++)
		  {
			  a[i]=sc.nextInt();
		  }
		  int f=sc.nextInt();
		  for(i=0;i<n;i++)
		  {
			  if(a[i]==f)
			  {
			   System.out.println("Found at position "+i); 
			   break;
			  }
			 if(a[i]==n)
			  {
			      System.out.println("-1");
			  }
		  }

	}

}
