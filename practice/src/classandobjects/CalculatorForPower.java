package classandobjects;

public class Question2classobject {
 
	public static int powerInt(int n1,int n2)
	{ 
		return (int) Math.pow(n1, n2);
	}
	public static double powerDouble(double n1,double n2)
	{
		return Math.pow(n1, n2);
	}
	public static void main(String[]args)
	{
		int ans1=powerInt(2,3);
		double ans2=powerDouble(333.3,3.0);
		System.out.println(ans1);
		System.out.println(ans2);
	}
}
