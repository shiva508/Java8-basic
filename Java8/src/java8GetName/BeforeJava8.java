package java8GetName;

import java.util.Arrays;
import java.util.List;

public class BeforeJava8 {
private static Person getByName(List<Person> persons,String name)
{
	Person result=null;
	for(Person temo:persons)
	{
		if(name.equals(temo.getName()))
				{
					result=temo;
				}
	}
	return result;
}
	public static void main(String[] args) 
	{
	List<Person>persons= Arrays.asList(
			new Person("Shiva",26),
			new Person("Satish",27),
			new Person("Ravi",18)
			);
	Person result=getByName(persons, "Shiva");
	System.out.println(result.toString());
	}

}
