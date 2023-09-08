package Inno_Assign_2;

import java.util.Comparator;
import java.util.List;

public class Question_08 {
//	Get the details of youngest male employee in the product development department?
	public Employee youngest(List<Employee> list)
	{
		return list.stream().min(Comparator.comparing(Employee::getAge)).get();
	}
}
