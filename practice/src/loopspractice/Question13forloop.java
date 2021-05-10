//Write a program to print prime numbers between 10 and 99.

package loopspractice;

public class Question13forloop {
	public static int checkprime(int m)
	{
		int flag=0,i;
		for(i=1;i<=m;i++)
        {
        	if(m%i==0)
        	{
        		flag++;
        	}
        
        }
		return flag;
		
	}
	public static void main(String[] args) {
		int i,ans;
		for(i=10;i<=99;i++)
		{
			ans=checkprime(i);
			if(ans==2)
			{
				System.out.println(i);
			}
		}
		
	}

}
