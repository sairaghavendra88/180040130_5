// Write a program to print * in Floyds format (using for and while loop)
//*
//*  *
//*  *   *


package loopspractice;

import java.util.Scanner;

public class Question16forloop {
	public static void main(String[]args)
	{
	int i,j,m;
	Scanner sc=new Scanner(System.in);
    m=sc.nextInt();
	for(i=0;i<m;i++)
	{
		for(j=0;j<=i;j++)
		{
		System.out.print("* ");
	}
		System.out.printf("\n");
	}
	}
}
