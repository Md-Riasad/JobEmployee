
public class Human extends Person implements Student {

	
	protected String Feelings;
	
	protected String Thought;
	
	protected String Humanity;

	public Human(String name, int id, int age, String gender, String address, String feelings, String thought,
			String humanity) {
		super(name, id, age, gender, address);
		Feelings = feelings;
		Thought = thought;
		Humanity = humanity;
	}

	

	public String getFeelings() {
		return Feelings;
	}

	public void setFeelings(String feelings) {
		Feelings = feelings;
	}

	public String getThought() {
		return Thought;
	}

	public void setThought(String thought) {
		Thought = thought;
	}

	public String getHumanity() {
		return Humanity;
	}

	public void setHumanity(String humanity) {
		Humanity = humanity;
	}

	@Override
	public String toString() {
		return "Human [Feelings=" + Feelings + ", Thought=" + Thought + ", Humanity=" + Humanity + ", toString()="
				+ super.toString() + ", getName()=" + getName() + ", getId()=" + getId() + ", getAge()=" + getAge()
				+ ", getGender()=" + getGender() + ", getAddress()=" + getAddress() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}



	@Override
	public String study() {
		// TODO Auto-generated method stub
		System.out.println("Dont Want to Study !!!!!! ");
		
		//System.out.println(getName());
		return getName();
	}



	@Override
	public String exam() {
		// TODO Auto-generated method stub
		System.out.println("Passed the Exam OOOOw");
		return Feelings;
	}

	

	
	
	
	
	
}
