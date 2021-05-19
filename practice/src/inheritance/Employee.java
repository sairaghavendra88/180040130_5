package inheritance;

public class Employee extends Person
{
	private static String n;
	private double salary;
    private int year;
    private String insnum;
    private Person person;
	public Employee(double s,int y,String ins)
    {
      super(n);
      salary = s;
      year=y;
      insnum=ins;
    }
	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", year=" + year + ", insnum=" + insnum + "]";
	}

    
}