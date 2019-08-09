package ExceptionsLang;

public class InvalidPassword extends Exception{
	private String message;
	
	public InvalidPassword(String message){
		// TODO Auto-generated method stub
		super(message);
		this.message = message;
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return this.message;
	}
	
}
