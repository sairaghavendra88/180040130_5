package inheritance;
public class Person
{
	private String name;

	public Person(String n)
	{
	  name = n;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
}

