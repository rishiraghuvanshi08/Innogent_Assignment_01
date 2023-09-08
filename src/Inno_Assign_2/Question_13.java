package Inno_Assign_2;

import java.util.List;
import java.util.stream.Collectors;

public class Question_13 {
//	Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years?			
	public List<Employee> youngerThan25(List<Employee> list)
	{
		return list.stream().filter(e -> e.getAge() <= 25).collect(Collectors.toList());
	}
	public List<Employee> olderThan25(List<Employee> list)
	{
		return list.stream().filter(e -> e.getAge() > 25).collect(Collectors.toList());
	}
}
