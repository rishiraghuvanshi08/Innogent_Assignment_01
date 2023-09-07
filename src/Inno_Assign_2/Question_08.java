package Inno_Assign_2;

import java.util.ArrayList;

public class Question_08 {
//	Get the details of youngest male employee in the product development department?
	public Employee youngest(ArrayList<Employee> list)
	{
		Employee e = null;
		int youngest = Integer.MAX_VALUE;
		for(int i = 0; i < list.size(); i++)
		{
			if(list.get(i).age < youngest)
			{
				e = list.get(i);
				youngest = list.get(i).age;
			}
		}
		return e;
	}
}
