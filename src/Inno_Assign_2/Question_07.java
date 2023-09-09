package Inno_Assign_2;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Question_07 {
//	What is the average salary of each department?
	public Map<String, Double> avgSalary(List<Employee> list)
	{
		Map<String, Double> departmentAverageSalaries = list.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)));

		return departmentAverageSalaries;
	}
}
