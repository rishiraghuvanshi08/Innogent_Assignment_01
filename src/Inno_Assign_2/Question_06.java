package Inno_Assign_2;

import java.util.ArrayList;
import java.util.HashMap;

public class Question_06 {
//	Count the number of employees in each department?
	public HashMap<String, Integer> noOfEmployeeInDep(ArrayList<Employee> list)
	{
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for(int i = 0; i < list.size(); i++)
		{
			map.put(list.get(i).department, map.getOrDefault(list.get(i).department, 0) + 1);
		}
		
		return map;
	}
}
