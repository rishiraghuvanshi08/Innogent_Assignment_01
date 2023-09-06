package Inno_Assign_2;

import java.util.ArrayList;

public class Question_02 {
//	Print the name of all departments in the organization?
	public ArrayList<String> departments(ArrayList<Employee> list)
	{
		ArrayList<String> departments = new ArrayList<>();
		
		for(int i = 0; i < list.size(); i++)
		{
			Employee e = list.get(i);
			
			if(departments.contains(e.department)) continue;
			
			departments.add(e.department);
		}
		
		return departments;
	}
}
