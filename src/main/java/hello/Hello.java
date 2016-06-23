package hello;

public class Hello {

	private String firstName;
	private String lastName;
	
	public Hello() {
		super();
		this.firstName = "ali";
		this.lastName = "ben ali";
	}
		
	public Hello(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	// change A
	// change B
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void display(){
		System.out.println("My FirstName "+ firstName + " My LastName "+ lastName);
	}
	
}
