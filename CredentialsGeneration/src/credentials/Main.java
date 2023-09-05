package credentials;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Please enter your first name: ");
			String firstName=sc.next();
			System.out.println("Please enter your last name:  ");
			String lastName=sc.next();
			Employee emp=new Employee(firstName,lastName);
			emp.selectDepartment();
			CredentialService cred=new CredentialServiceImpl();
			cred.showCredentials(emp);
	
			
		}
		
	
		
	}
}
