package Inno_Assign_2;

import java.util.List;
import java.util.stream.Collectors;

public class Question_10 {
//	What is the average salary of male and female employees?
	public double avgOfMale(List<Employee> list)
	{
		List<Employee> maleEmp = list.stream().filter(e -> "Male".equals(e.getGender())).collect(Collectors.toList());
		
		Double sum = maleEmp.stream().map(e -> e.getSalary()).reduce(0d,Double::sum);
		
		return sum/maleEmp.size();
	}
	public double avgOfFemale(List<Employee> list)
	{
		List<Employee> femaleEmp = list.stream().filter(e -> "Female".equals(e.getGender())).collect(Collectors.toList());
		
		Double sum = femaleEmp.stream().map(e -> e.getSalary()).reduce(0d,(e,i)->e+i);
		
		return sum/femaleEmp.size();
	}
}
