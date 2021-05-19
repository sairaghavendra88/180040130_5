package stringspractice;

public class Question2Strings {
	public static String conCat(String a, String b) {
	    if(a.length() == 0 || b.length() == 0)
	        return a + b;
	          
	    if(a.charAt(a.length() - 1) == b.charAt(0))
	        return a + b.substring(1);
	                    
	    return a + b;

}
	public static void main(String[]args)
	{
		String a="sachin";
		String b="Tendulkar";
		System.out.print(conCat(a,b));
	}
}