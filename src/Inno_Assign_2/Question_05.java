package Inno_Assign_2;

import java.util.List;
import java.util.stream.Collectors;

public class Question_05 {
//	Get the names of all employees who have joined after 2015?
	public List<String> joinedAfter2015(List<Employee> list)
	{
		int targetYear = 2015;
		return list.stream().filter(e -> e.yearOfJoining > targetYear).map(Employee::getName).collect(Collectors.toList());
	}
}
