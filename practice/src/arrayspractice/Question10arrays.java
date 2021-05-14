package arrayspractice;

import java.util.Scanner;

public class Question10arrays {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    int i,j;
		  int n=sc.nextInt();
		  int a[][]=new int[n][n];
		  System.out.println("Please enter  integer numbers");
		  for(i=0;i<n;i++)
		  {
		      for(j=0;j<n;j++)
		      {
			  a[i][j]=sc.nextInt();
		      }
		  }
		  
		  System.out.println("The given array is :");
		  for(i=0;i<n;i++)
		  {
		  for(j=0;j<n;j++)
		  {
		      System.out.print(a[i][j]+" ");
		  }
		  System.out.print("\n");
		  }
}
	

}
