package Inno_Assign_2;

import java.util.ArrayList;

public class Question_03 {
//	What is the average age of male and female employees?
	public double average(ArrayList<Employee> list)
	{
		int sum = 0;
		for(int i = 0; i < list.size(); i++)
		{
			sum += list.get(i).age;
		}
		
		double avgAge = (double)(sum / list.size());
		
		return avgAge;
	}
}
