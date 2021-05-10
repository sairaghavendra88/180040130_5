package stringspractice;

public class Stringpractice {
	public static void main(String[]args)
	{
	String s="hi iam raghavendra";
	//char at index
	System.out.println(s.charAt(0));
	//string length
	System.out.println(s.length());
	//index of char
	System.out.println(s.indexOf('h'));
	//last index of char
	System.out.println(s.lastIndexOf('h'));
	//upper case and lower case
	System.out.println(s.toUpperCase()+" "+s.toLowerCase());
	//split
	String str="hi:split";
	String ch[]=str.split(":");
	for(String x:ch)
	{
	System.out.println(x);
	}
	//to char array
	char b[]=str.toCharArray();
	for(char x:b)
	{
	System.out.print(" "+x);
	}
	System.out.printf("\n");
	//equals
	System.out.println(s.equals(str));
	//compareto
	String s1=" equal";
	String s2=" equal";
	System.out.println(s1.compareTo(s2));
	//concatenation
	System.out.println(s1.concat(s2));
	//substring
	System.out.println(s2.substring(2,4));
	//trimming
	System.out.println(s1.trim());
}
}

