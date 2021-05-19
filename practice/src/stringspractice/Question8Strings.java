package stringspractice;

public class Question8Strings {

	public static void main(String[]args)
	{
		String str="ab*cd";
		int n=str.length();
		char ch[]=str.toCharArray();
		int i=0;
		for(i=0;i<n;i++)
		{
			if(i==0&&ch[i+1]!='*'&&ch[i]!='*')
			{
				System.out.print(ch[i]);
			 }
			if(i>0&&i!=n-1&&ch[i]!='*'&&ch[i-1]!='*'&&ch[i+1]!='*')
			{
				System.out.print(ch[i]);
			}
			if(i>0&&i==n-1&&ch[i]!='*'&&ch[i-1]!='*')
			{
				System.out.print(ch[i]);
			}
			
		}
}
	}
