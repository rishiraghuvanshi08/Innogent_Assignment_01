package Inno_Assign_2;

import java.util.ArrayList;

public class Question_05 {
//	Get the names of all employees who have joined after 2015?
	public ArrayList<String> joinedAfter2015(ArrayList<Employee> list)
	{
		ArrayList<String> listOfNames = new ArrayList<>();
		
		for(int i = 0; i < list.size(); i++)
		{
			int yearOfJoining = list.get(i).yearOfJoining;
			if(yearOfJoining > 2015)
			{
				listOfNames.add(list.get(i).name);
			}
		}
		return listOfNames;
	}
}
