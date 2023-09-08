package Inno_Assign_2;

import java.util.List;
import java.util.stream.Collectors;

public class Question_11 {
//	List down the names of all employees in each department?
	public List<String> empNameInDeps(List<Employee> list)
	{
		List<String> listOfDep = list.stream().map(e -> e.getDepartment()).distinct().collect(Collectors.toList());
		return listOfDep;
	}
}
