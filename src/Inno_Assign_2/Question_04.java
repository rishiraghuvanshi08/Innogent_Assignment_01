package Inno_Assign_2;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Question_04 {
//	Get the details of highest paid employee in the organization?
	public Optional<Employee> highestPaid(List<Employee> list)
	{
		Optional<Employee> highestPaid = list.stream().max(Comparator.comparing(Employee::getSalary));
		
		return highestPaid;
	}
}
