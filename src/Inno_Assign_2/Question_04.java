package Inno_Assign_2;

import java.util.Comparator;
import java.util.List;

public class Question_04 {
//	Get the details of highest paid employee in the organization?
	public Employee highestPaid(List<Employee> list)
	{
		return list.stream().max(Comparator.comparing(Employee::getSalary)).get();
	}
}
