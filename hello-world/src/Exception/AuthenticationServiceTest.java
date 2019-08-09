package Exception;

import ExceptionsLang.InvalidPassword;
import ExceptionsLang.InvalidUserName;

public class AuthenticationServiceTest {
	public static void main(String[] args) {
		Account UserAccount = new Account();
		UserAccount.setUsername("administrator");
		UserAccount.setPassword("pass1234");
		
		AuthenticationService AuthService = new AuthenticationService();
		
		try {
			AuthService.AuthenticateUserAccount(UserAccount);
			System.out.println("Tama");
		} catch (InvalidUserName e) {			
			System.out.println(e.getMessage());			
		} catch (InvalidPassword e) {
			System.out.println(e.getMessage());			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}	
}
