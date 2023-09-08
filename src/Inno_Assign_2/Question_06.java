package Inno_Assign_2;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Question_06 {
//	Count the number of employees in each department?
	public Map<String,Long> noOfEmployeeInDep(List<Employee> list)
	{
		return list.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
	}
}
