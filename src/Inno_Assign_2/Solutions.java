package Inno_Assign_2;

import java.util.ArrayList;

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
	}
}
