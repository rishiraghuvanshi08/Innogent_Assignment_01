package Inno_Assign_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Question_07 {
//	What is the average salary of each department?
	public Map<String, Double> avgSalary(ArrayList<Employee> list)
	{
		Map<String, Integer> count = new HashMap<>();
		for(int i = 0; i < list.size(); i++)
		{
			count.put(list.get(i).department, count.getOrDefault(list.get(i).department, 0) + 1);
		}
		
		Map<String, Double> map = new HashMap<>();
		
		for(int i = 0; i < list.size(); i++)
		{
			Double d = list.get(i).salary + map.getOrDefault(list.get(i).department, 0d);
			map.put(list.get(i).department, d);
		}
		
		Map<String, Double> avgSal = new HashMap<>();
		
		for(Map.Entry<String, Double> m1 : map.entrySet())
		{
			double sumSal = m1.getValue();
			double avgSalary = sumSal / (double)count.get(m1.getKey());
			
			avgSal.put(m1.getKey(), avgSalary);
		}
		
		return avgSal;
	}
}
