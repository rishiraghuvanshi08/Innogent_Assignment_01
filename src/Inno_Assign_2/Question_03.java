package Inno_Assign_2;

import java.util.List;
import java.util.stream.Collectors;

public class Question_03 {
//	What is the average age of male and female employees?
	public double average(List<Employee> list)
	{
		List<Employee> maleEmp = list.stream().filter(e -> "Male".equals(e.gender)).collect(Collectors.toList());
		
		Integer sum=maleEmp.stream().map(e -> e.age).reduce(0,(c,e)->c+e);
		
		return sum/maleEmp.size();
	}
}
