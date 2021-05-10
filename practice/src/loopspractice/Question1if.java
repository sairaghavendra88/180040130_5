//Write a program to check if a given integer number is Positive, Negative, or Zero.
package loopspractice;

import java.util.Scanner;

public class Question1if {
	    public static void main(String args[]) {
	      int x;
	      Scanner sc=new Scanner(System.in);
	      x=sc.nextInt();
	      if(x>0)
	      {
	          System.out.println("positive");
	      }
	      else if(x==0)
	      {
	          System.out.println("zero");
	      }
	      else
	      {
	         System.out.println("negative");   
	      }
	    }
	}
