package stringspractice;
import java.util.*;
public class Question1Strings {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	String pal=sc.next();
	char ch[]=pal.toCharArray();  
    String rev="";  
    for(int i=ch.length-1;i>=0;i--){  
        rev+=ch[i];  
    }  
    if(pal.equals(rev))
    {
    	System.out.println("palindrome");
    }
    else
    {
    	System.out.println("not palindrome");
    }
}
}
