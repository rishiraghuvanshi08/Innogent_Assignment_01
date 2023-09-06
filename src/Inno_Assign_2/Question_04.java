package Inno_Assign_2;

import java.util.ArrayList;

public class Question_04 {
//	Get the details of highest paid employee in the organization?
	public Employee highestPaid(ArrayList<Employee> list)
	{
		Employee e = null;
		double highest = 0d;
		for(int i = 0; i < list.size(); i++)
		{
			if(list.get(i).salary > highest)
			{
				e = list.get(i);
			}
		}
		return e;
	}
}
