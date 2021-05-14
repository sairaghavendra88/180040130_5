package classandobjects;

public class Patient {
	String name="Raghavendra";
	double height=1.8;
	double weight=80.2;
	double computeBmi()
	{
		double ans=weight/(height*height);
		return ans;
	}
	public static void main(String[]args)
	{
		Patient p=new Patient();
	    System.out.println(p.name);
	    System.out.println(p.height);
	    System.out.println(p.weight);
	    System.out.println(p.computeBmi());
	}
	

}
