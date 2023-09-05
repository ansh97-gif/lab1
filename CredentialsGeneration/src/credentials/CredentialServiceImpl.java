package credentials;

import java.util.Random;

public class CredentialServiceImpl implements CredentialService {
	@Override
	public String generatePassword() {
		// TODO Auto-generated method stub
		Random rand=new Random();
		String str=capitalLetters+smallLetters+specialCharacters;
		int len=str.length();
		String password="";
		for(int i=0;i<8;i++) {
			int randInd=rand.nextInt(len);
			password+=str.charAt(randInd);
		}
		return password;
	}

	@Override
	public String generateEmailAddress(Employee emp) {
		String emailAddress=emp.getFirstName()+emp.getLastName()+"@"+emp.getDepartment()+"."+emp.getCompany()+".com";
		return emailAddress;
	}

	@Override
	public void showCredentials(Employee emp) {
		System.out.println("Dear "+emp.getFirstName()+" your generated credentials are as follows");
		System.out.println("Email  --->"+ generateEmailAddress(emp));
		System.out.println("Password --->"+generatePassword());
		// TODO Auto-generated method stub

	}

}
