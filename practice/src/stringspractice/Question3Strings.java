package stringspractice;

public class Question3Strings {
	public static void main(String[]args)
	{
		String a="Wipro";
		int n=a.length();
		while(n>0)
		{
			System.out.print(a.substring(0,2));
			n--;
		}
}
}
