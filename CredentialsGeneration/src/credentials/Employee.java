package credentials;
import java.util.*;

public class Employee {
	private String firstName;
	
	private String lastName;
	
	private String department;
	
	private String company;
	
	

	public Employee(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.company = "abc";
	}

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

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	
	public void selectDepartment() {
		System.out.println("Please select from the following");
		System.out.println("1.Technical");
		System.out.println("2.Admin");
		System.out.println("3.Human Resource");
		System.out.println("4.Legal");
		try (Scanner sc = new Scanner(System.in)) {
			int choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				department="technical";
			break;
			case 2:
				department="admin";
			break;
			case 3:
				department="hr";
			break;
			case 4:
				department="legal";
				break;
				
			default:
				System.out.println("Invalid choice!!!Please select the options from 1-4");			
			}
		}
	
			
		
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
	
	

}
