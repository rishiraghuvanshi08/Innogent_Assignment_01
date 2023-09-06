package Inno_Assign_2;

public class Employee {
	int id;

	String name;

	int age;

	String gender;

	String department;

	int yearOfJoining;

	double salary;

	public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.yearOfJoining = yearOfJoining;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "ID = " + id + ", Name = " + name + ", Age = "
				+ age + ", Gender = " + gender + ", Department = " 
				+ department + ", Year Of Joining = " + yearOfJoining + ", Salary = " + salary;
	}
}
