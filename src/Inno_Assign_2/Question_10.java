package Inno_Assign_2;

import java.util.ArrayList;

public class Question_10 {
//	What is the average salary of male and female employees?
	public double avgOfMale(ArrayList<Employee> list)
	{
		int count = 0;
		for(int i = 0; i < list.size(); i++)
		{
			if(list.get(i).gender.equals("Male"))
				count++;
		}
		
		double salSum = 0;
		for(int i = 0; i < list.size(); i++)
		{
			if(list.get(i).gender.equals("Male"))
			{
				salSum += list.get(i).salary;
			}
		}
		
		double avgMale = salSum / count;
		
		return avgMale;
	}
	public double avgOfFemale(ArrayList<Employee> list)
	{
		int count = 0;
		for(int i = 0; i < list.size(); i++)
		{
			if(list.get(i).gender.equals("Female"))
				count++;
		}
		
		double salSum = 0;
		for(int i = 0; i < list.size(); i++)
		{
			if(list.get(i).gender.equals("Female"))
			{
				salSum += list.get(i).salary;
			}
		}
		
		double avgMale = salSum / count;
		
		return avgMale;
	}
}
