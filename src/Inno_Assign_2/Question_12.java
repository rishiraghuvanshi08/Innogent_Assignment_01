package Inno_Assign_2;

import java.util.List;

public class Question_12 {
//	What is the average salary and total salary of the whole organization?
	public double totalSalary(List<Employee> list)
	{
		return list.stream().map(e -> e.getSalary()).reduce(0.0, Double::sum);
	}
	public double avgSalary(List<Employee> list)
	{
		double totalSal = totalSalary(list);
		return totalSal/list.size();
	}
}
