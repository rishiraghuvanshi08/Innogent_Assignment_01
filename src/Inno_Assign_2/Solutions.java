package Inno_Assign_2;

import java.util.List;
import java.util.Map;

public class Solutions {
	public static void main(String[] args) {

		List<Employee> list = AddDemoData.addData();

		System.out.println("Solution 01");
//		How many male and female employees are there in the organization?
		Question_01 q1 = new Question_01();

		int maleCount = q1.maleCount(list);
		int femaleCount = q1.femaleCount(list);

		System.out.println("Male Employee : " + maleCount);
		System.out.println("Female Employee : " + femaleCount);

		System.out.println();
		System.out.println("Solution 02");
//		Print the name of all departments in the organization?
		Question_02 q2 = new Question_02();

		List<String> departments = q2.departments(list);
		System.out.println("Departments in Organization : " + departments);

		System.out.println();
		System.out.println("Solution 03");
//		What is the average age of male and female employees?
		Question_03 q3 = new Question_03();

		double avgAgeMale = q3.averageAgeMale(list);
		System.out.println("Average Age Male : " + avgAgeMale);
		double avgAgeFemale = q3.averageAgeFemale(list);
		System.out.println("Average Age Female : " + avgAgeFemale);

		System.out.println();
		System.out.println("Solution 04");
//		Get the details of highest paid employee in the organization?
		Question_04 q4 = new Question_04();

		Employee highestSal = q4.highestPaid(list);
		System.out.println(highestSal);

		System.out.println();
		System.out.println("Solution 05");
//		Get the names of all employees who have joined after 2015?
		Question_05 q5 = new Question_05();

		List<String> joinedAfter2015 = q5.joinedAfter2015(list);

		System.out.println("Employee Names who have joinind after 2015 : " + joinedAfter2015);

		System.out.println();
		System.out.println("Solution 06");
//		Count the number of employees in each department?
		Question_06 q6 = new Question_06();

		Map<String, Long> empCountInDep = q6.noOfEmployeeInDep(list);

		System.out.println("Number of employees in each department : " + empCountInDep);

		System.out.println();
		System.out.println("Solution 07");
//		What is the average salary of each department?
		Question_07 q7 = new Question_07();

		Map<String, Double> avgSalary = q7.avgSalary(list);
		System.out.println("Average salary of each department : " + avgSalary);

		System.out.println();
		System.out.println("Solution 08");
//		Get the details of youngest male employee in the product development department?
		Question_08 q8 = new Question_08();

		System.out.println("Youngest Employee : "+ q8.youngest(list));

		System.out.println();
		System.out.println("Solution 09");
//		How many male and female employees are there in the sales and marketing team?
		Question_09 q9 = new Question_09();

		long femaleInSandM = q9.noOfFemaleInSandM(list);
		long maleInSandM = q9.noOfMaleInSandM(list);
		System.out.println("Count of Female In Sales and Marketing : " + femaleInSandM);
		System.out.println("Count of Male In Sales and Marketing : " + maleInSandM);

		System.out.println();
		System.out.println("Solution 10");
//		What is the average salary of male and female employees?
		Question_10 q10 = new Question_10();

		double avgMaleSal = q10.avgOfMale(list);
		System.out.println("Average salary of Male : " + avgMaleSal);
		double avgFemaleSal = q10.avgOfFemale(list);
		System.out.println("Average salary of Female : " + avgFemaleSal);

		System.out.println();
		System.out.println("Solution 11");
//		List down the names of all employees in each department?	*****
		Question_11 q11 = new Question_11();

		System.out.println(q11.empNameInDeps(list));

		System.out.println();
		System.out.println("Solution 12");
//		What is the average salary and total salary of the whole organization?
		Question_12 q12 = new Question_12();

		System.out.println("Total Salary : "+ q12.totalSalary(list));
		System.out.println("Average Salary : "+ q12.avgSalary(list));

		System.out.println();
		System.out.println("Solution 13");
//		Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years?
		Question_13 q13 = new Question_13();

		System.out.println("Employees younger than or equal to 25 : "+ q13.youngerThan25(list));
		System.out.println("Employees older than  25 : "+ q13.olderThan25(list));

		System.out.println();
		System.out.println("Solution 14");
//		Who is the oldest employee in the organization? What is his age and which department he belongs to?
		Question_14 q14 = new Question_14();

		Employee oldest = q14.oldestEmployee(list);
		System.out.println("Oldest Employees : "+ q14.oldestEmployee(list));
		System.out.println("Age : "+ oldest.getAge());
		System.out.println("Department : " + oldest.getDepartment());
	}
}
