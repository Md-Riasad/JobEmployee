
public class Person {
 
	private String Name ;
	
	private int Id;
	private int Age ;
	private String Gender;
	private String Address;
	
	// shits+Alt+S 
	// for store data  set
	// for get data get 
	
	
	public Person(String name, int id, int age, String gender, String address) {
		//super();
		Name = name;
		Id = id;
		Age = age;
		Gender = gender;
		Address = address;
	}
	
	
	
	
	public Person() {
		//super();
	}




	@Override
	public String toString() {
		return "Person [Name=" + Name + ", Id=" + Id + ", Age=" + Age + ", Gender=" + Gender + ", Address=" + Address
				+ "]";
	}




	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	
	
}
