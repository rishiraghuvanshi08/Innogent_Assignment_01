package Inno_Assign_2;

import java.util.List;
import java.util.stream.Collectors;

public class Question_02 {
//	Print the name of all departments in the organization?
	public List<String> departments(List<Employee> list)
	{
		return list.stream().map(emp->emp.department).distinct().collect(Collectors.toList());
	}
}
