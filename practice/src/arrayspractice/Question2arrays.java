package arrayspractice;
import java.util.*;
public class Question2arrays {
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int i;
		  int n=sc.nextInt();
		  int a[]=new int[n];
		  int max = a[0];  
		  int min =a[0];
		  for(i=0;i<n;i++)
		  {
			  a[i]=sc.nextInt();
		  }
		  for(i=0;i<n;i++)
		  {
			   if(a[i] > max)  
	             max = a[i];
	          if(a[i] < min)
	           min = a[i];
		  }
		  System.out.println("Max value in the array "+max);
		  System.out.println("Min value in the array "+min);		
		}
}
