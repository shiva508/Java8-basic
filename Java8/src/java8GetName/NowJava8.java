package java8GetName;

import java.util.Arrays;
import java.util.List;

public class NowJava8 
{

	public static void main(String[] args) 
	{
		List<Person> persons = Arrays.asList(
                new Person("Shiva", 30),
                new Person("Ravi", 20),
                new Person("Satish", 40));
		Person result1=persons.stream().filter(x->"Shiva".equals(x.getName()))
				.findAny().orElse(null);
		System.out.println(result1);
		
		
		Person result2=persons.stream().filter(x->"Satish".equals(x.getName()))
				.findAny().orElse(null);
		System.out.println(result2);
	}

}
