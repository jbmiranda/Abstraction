package Exception;

import ExceptionsLang.InvalidPassword;
import ExceptionsLang.InvalidUserName;

public class AuthenticationService {
	public void AuthenticateUserAccount(Account Account) throws InvalidUserName, InvalidPassword {
		if(Account==null) {
			throw new IllegalArgumentException("Account cannot be null.");
		}
		
		if(!"administrator".equals(Account.getUsername())) {
			throw new InvalidUserName("Invalid username");
		}
		if(!"pass123".equals(Account.getPassword())) {
			throw new InvalidPassword("Invalid password");
		}
	}

}
