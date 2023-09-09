package Inno_Assign_2;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Question_11 {
//	List down the names of all employees in each department?
	public Map<String, List<Employee>> empNameInDeps(List<Employee> list)
	{
		return list.stream().collect(Collectors.groupingBy(Employee::getDepartment));
	}
}
