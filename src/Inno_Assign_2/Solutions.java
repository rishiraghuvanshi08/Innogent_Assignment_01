package Inno_Assign_2;

import java.util.ArrayList;
import java.util.Map;

public class Solutions {
	public static void main(String[] args) {
		
		ArrayList<Employee> list = AddDemoData.addData();
		
//		How many male and female employees are there in the organization?
		Question_01 q1 = new Question_01();
	
		int maleCount = q1.maleCount(list);
		int femaleCount = q1.femaleCount(list);
		
		System.out.println("Male Employee : " + maleCount);
		System.out.println("Female Employee : " + femaleCount);
		
		System.out.println();
//		Print the name of all departments in the organization?
		Question_02 q2 = new Question_02();
		
		ArrayList<String> departments = q2.departments(list);
		System.out.println("Departments in Organization :");
		for(String d : departments) {
			System.out.println(d);
		}
		
		System.out.println();
//		What is the average age of male and female employees?
		Question_03 q3 = new Question_03();
		
		double avgAge = q3.average(list);
		System.out.println("Average Age : " + avgAge);
		
		System.out.println();
//		Get the details of highest paid employee in the organization?
		Question_04 q4 = new Question_04();
		
		Employee e = q4.highestPaid(list);
		System.out.println(e);
		
		System.out.println();
//		Get the names of all employees who have joined after 2015?
		Question_05 q5 = new Question_05();
		
		ArrayList<String> joinedAfter2015 = q5.joinedAfter2015(list);
		
		System.out.println("Employee Names who have joinind after 2015 :");
		for(String e2: joinedAfter2015)
			System.out.println(e2);
		
		System.out.println();
//		Count the number of employees in each department?
		Question_06 q6 = new Question_06();
		
		Map<String, Integer> noOfEmployeeInDep = q6.noOfEmployeeInDep(list);
		
		System.out.println("Number of employees in each department :");
		for(Map.Entry<String, Integer> m : noOfEmployeeInDep.entrySet())
			System.out.println(m);
		
		System.out.println();
//		What is the average salary of each department?
		Question_07 q7 = new Question_07();
		
		Map<String, Double> avgSalary = q7.avgSalary(list);
		System.out.println("Average salary of each department :");
		
		for(Map.Entry<String, Double> m2 : avgSalary.entrySet())
			System.out.println(m2);
		
		System.out.println();
//		Get the details of youngest male employee in the product development department?
		Question_08 q8 = new Question_08();
		
		System.out.println("Youngest Employee :");
		System.out.println(q8.youngest(list));
		
		System.out.println();
//		How many male and female employees are there in the sales and marketing team?
		Question_09 q9 = new Question_09();
		
		int femaleInSandM = q9.noOfFemaleInSandM(list);
		int maleInSandM = q9.noOfMaleInSandM(list);
		System.out.println("Count of Female In Sales and Marketing : " + femaleInSandM);
		System.out.println("Count of Male In Sales and Marketing : " + maleInSandM);
		
		System.out.println();
//		What is the average salary of male and female employees?
		Question_10 q10 = new Question_10();
		
		double avgMaleSal = q10.avgOfMale(list);
		System.out.println("Average salary of Male : " + avgMaleSal);
		double avgFemaleSal = q10.avgOfFemale(list);
		System.out.println("Average salary of Female : " + avgFemaleSal);
		
		System.out.println();
//		List down the names of all employees in each department?
		
		
		
		
	}
}
