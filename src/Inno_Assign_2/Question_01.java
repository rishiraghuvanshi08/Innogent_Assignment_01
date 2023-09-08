package Inno_Assign_2;

import java.util.List;
import java.util.stream.Collectors;

public class Question_01 {
	//	How many male and female employees are there in the organization?
	public int maleCount(List<Employee> list)
	{
		return list.stream().filter(emp->"Male".equals(emp.gender)).collect(Collectors.toList()).size();
	}
	public int femaleCount(List<Employee> list)
	{
		return list.stream().filter(emp->"Female".equals(emp.gender)).collect(Collectors.toList()).size();
	}
}
