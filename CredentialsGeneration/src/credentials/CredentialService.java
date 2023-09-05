package credentials;

public interface CredentialService {
	String capitalLetters="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String smallLetters=capitalLetters.toLowerCase();
	String specialCharacters = "!@#$%^&*()-_+={}[]|:;\"'<>,.?/";
	
	public String generatePassword();
	
	public String generateEmailAddress(Employee emp);
	
	public void showCredentials(Employee emp);

}
