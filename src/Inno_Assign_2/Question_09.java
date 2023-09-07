package Inno_Assign_2;

import java.util.ArrayList;

public class Question_09 {
//	How many male and female employees are there in the sales and marketing team?
	public int noOfMaleInSandM(ArrayList<Employee> list)
	{
		int count = 0;
		
		for(int i = 0; i < list.size(); i++)
		{
			if(list.get(i).department.equals("Sales And Marketing"))
			{
				if(list.get(i).gender.equals("Male"))
					count++;
			}
		}
		
		return count;
	}
	public int noOfFemaleInSandM(ArrayList<Employee> list)
	{
		int count = 0;
		
		for(int i = 0; i < list.size(); i++)
		{
			if(list.get(i).department.equals("Sales And Marketing"))
			{
				if(list.get(i).gender.equals("Female"))
					count++;
			}
		}
		
		return count;
	}
}
