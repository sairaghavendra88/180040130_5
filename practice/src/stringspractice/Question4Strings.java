package stringspractice;

public class Question4Strings {
	public static void main(String[]args)
	{
		String a="TomCat";
		int n=a.length();
		if(n%2==0)
		{
			System.out.println(a.substring(0,n/2));
		}
		else
		{
			System.out.println("null");
		}

}
}
