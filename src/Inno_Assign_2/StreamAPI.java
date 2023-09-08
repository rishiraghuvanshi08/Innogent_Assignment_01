package Inno_Assign_2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {
	public static void main(String[] args) {
		List<Integer> list = List.of(2,4,5,6,8,1);
		
		Stream<Integer> stream = list.stream();
		
//		collect: The collect method is used to return the result of the intermediate operations performed on the stream.
		List<Integer> l = stream.map(x -> x*x*x).collect(Collectors.toList());
		System.out.println(l);
		
//		forEach: The forEach method is used to iterate through every element of the stream.
		List<Integer> number = Arrays.asList(2,3,4,5);
		number.stream().map(x->x*x).forEach(y->System.out.println(y));
		
		List<Integer> num1 = Arrays.asList(2,3,4,5);
		num1.stream().filter(x->x%2==0).reduce(0,(ans,i)->ans+i);
		System.out.println("-------");
//		List num = Arrays.asList(2,3,4,5);
		int even = number.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);
		System.out.println(even);
	
	}
}
