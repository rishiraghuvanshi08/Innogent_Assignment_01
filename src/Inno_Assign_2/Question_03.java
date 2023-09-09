package Inno_Assign_2;

import java.util.List;

public class Question_03 {
//	What is the average age of male and female employees?
	public double averageAgeMale(List<Employee> list)
	{
		return list.stream().filter(e -> e.getGender().equals("Male")).mapToInt(Employee::getAge).average().orElse(0.0);
	}
	public double averageAgeFemale(List<Employee> list)
	{
		return list.stream().filter(e -> e.getGender().equals("Female")).mapToInt(Employee::getAge).average().orElse(0.0);
	}
}
