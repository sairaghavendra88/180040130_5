package stringspractice;

public class Question11Strings {
	public static void main(String[]args)
	{
	String a="abcXY123XYijk";
	String b="XY";
	int la=a.length();
	int lb=b.length();
	for(int i=0;i<la-lb;i++)
	{
		if(b.equals(a.substring(i,i+lb)))
		{
			if(i!=0)
			{
			System.out.print(a.charAt(i-1));
			System.out.print(a.charAt(i+lb));
			}
		}
	}

}
}
