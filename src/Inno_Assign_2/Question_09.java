package Inno_Assign_2;

import java.util.List;

public class Question_09 {
//	How many male and female employees are there in the sales and marketing team?
	public long noOfMaleInSandM(List<Employee> list)
	{
		return list.stream().filter(e -> "Sales And Marketing".equals(e.getDepartment()) && "Male".equals(e.getGender())).count();
	}
	public long noOfFemaleInSandM(List<Employee> list)
	{
		return list.stream().filter(e -> "Sales And Marketing".equals(e.getDepartment()) && "Female".equals(e.getGender())).count();
	}
}
