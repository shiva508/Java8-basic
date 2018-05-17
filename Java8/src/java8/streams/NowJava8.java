package java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class NowJava8 {

	public static void main(String[] args) {
		List<String>lines=Arrays.asList("Shiva","Dasari","Tony");
		List<String> result=lines.stream().filter(line->!"Shiva".equals(line))
				.collect(Collectors.toList());
		result.forEach(System.out::println);

	}

}
