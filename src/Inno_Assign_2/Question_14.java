package Inno_Assign_2;

import java.util.Comparator;
import java.util.List;

public class Question_14 {
//	Who is the oldest employee in the organization? What is his age and which department he belongs to?		
	public Employee oldestEmployee(List<Employee> list)
	{
		return list.stream().max(Comparator.comparing(Employee::getAge)).get();
	}
}
