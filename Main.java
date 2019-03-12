
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Person p =new Person("Riasad",01,23,"Male","Banasree");
		
//		p.setName("Riasad");
//		p.setId(01);
//		p.setAge(23);
//		p.setGender("Male");
//		p.setAddress("Banasree");
		//p.getName();
		
		p.getName();
		p.getId();
		p.getAge();
		p.getGender();
		p.getAddress();
		
		//System.out.println(" \nName :"+p.getName()+"\nID :"+p.getId()+"\nAge :"+p.getAge()+"\nGender :"+p.getGender()+"\nAddress :"+p.getAddress());
		
		System.out.println( p.toString());
		
		Human H = new Human("Riasad",01,23,"Male","Banasree","Good","Nice ","Good");

		System.out.println( H.toString());
		H.study();
		H.exam();
		System.out.println("Name :"+H.study());
		System.out.println("Name :"+H.exam());
		
//		//EmployeeDetails E =new EmployeeDetails();
//		E.setEmpName("Riasad Rahman");
//		System.out.println( E.attendance());
//		System.out.println( E.salary());
		
	}

}
