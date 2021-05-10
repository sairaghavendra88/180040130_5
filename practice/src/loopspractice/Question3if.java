//Write a program to check if the program has received command line arguments or not.
package loopspractice;

public class Question3if {
	public static void main (String[] args)
    {  
		if (args.length ==0)
            {
            System.out.println("No Values");
    }
        else{
            for(String i : args)
                System.out.print(i+" , ");        }
        }
}
