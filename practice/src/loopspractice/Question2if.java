//Write a program to check if a given integer number is odd or even.
package loopspractice;

import java.util.Scanner;

public class Question2if {
    public static void main(String args[]) {
    	 int x;
	      Scanner sc=new Scanner(System.in);
	      x=sc.nextInt();
        if(x%2==0)
        {
            System.out.println("even");
        }
        else
        {
           System.out.println("odd");   
        }
    }

}
