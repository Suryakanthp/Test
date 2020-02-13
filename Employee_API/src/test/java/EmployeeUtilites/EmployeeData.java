package EmployeeUtilites;

public class EmployeeData {

	private int id;
	private String employeeName;
	private int employeeAge;
	private double employeeSalary;
	private String profileImage;
	
	
	public void Employee(int id,String employeeName, int employeeAge, double employeeSalary){
		this.id=id;
		this.employeeName = employeeName;
		this.employeeAge = employeeAge;
		this.employeeSalary = employeeSalary;
		//this.profileImage = profileImage;	
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		System.out.println("set id "+id);
		this.id = id;
	}


	public String getEmployeeName() {
		return employeeName;
	}


	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}


	public int getEmployeeAge() {
		return employeeAge;
	}


	public void setEmployeeAge(int employeeAge) {
		this.employeeAge = employeeAge;
	}


	public double getEmployeeSalary() {
		return employeeSalary;
	}


	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}


	public String getProfileImage() {
		return profileImage;
	}


	public void setProfileImage(String profileImage) {
		this.profileImage = profileImage;
	}
	

	

}
