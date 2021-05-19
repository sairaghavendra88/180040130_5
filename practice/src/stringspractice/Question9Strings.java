package stringspractice;

public class Question9Strings {
	public static void main(String[]args)
	{
	String a="Hello";
	String b="World";
	int l=Math.min(a.length(),b.length());
    for(int i=0;i<l;i++)
    {
    	System.out.print(a.charAt(i));
    	System.out.print(b.charAt(i));
    }
    if(a.length()<b.length())
    {
    	for(int i=l;i<b.length();i++)
    	{
    		System.out.print(b.charAt(i));
    	}
    }
    else
    {
    	for(int i=l;i<a.length();i++)
    	{
    		System.out.print(a.charAt(i));
    	}
    }
    	
    }
}
