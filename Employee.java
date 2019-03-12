
public abstract class Employee {
	
	private String EmpName;
	
	private int EmpId;
	
	private double Salary;
	
	private String Department;

	
	
	
	public String getEmpName() {
		return EmpName;
	}

	public void setEmpName(String empName) {
		EmpName = empName;
	}

	public int getEmpId() {
		return EmpId;
	}

	public void setEmpId(int empId) {
		EmpId = empId;
	}

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {
		Salary = salary;
	}

	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String department) {
		Department = department;
	}

	
		public String attendance () {
		System.out.println("This is from Attendance");
	    return getEmpName();
                 };	
	
	
	public abstract String salary();
	
	

}
