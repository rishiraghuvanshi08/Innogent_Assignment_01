package Inno_Assign_2;

import java.util.ArrayList;

public class Question_01 {
	//	How many male and female employees are there in the organization?
	public int maleCount(ArrayList<Employee> list)
	{
		int count = 0;
		
		for(int i = 0; i < list.size(); i++)
		{
			Employee e = list.get(i);
			if(e.gender.equals("Male")) count++;
		}
		
		return count;
	}
	public int femaleCount(ArrayList<Employee> list)
	{
		int count = 0;
		
		for(int i = 0; i < list.size(); i++)
		{
			Employee e = list.get(i);
			if(e.gender.equals("Female")) count++;
		}
		
		return count;
	}
}
