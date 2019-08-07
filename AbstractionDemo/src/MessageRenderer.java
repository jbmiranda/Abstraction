
public class MessageRenderer implements IMessageRenderer{
	private IMessageProvider messageProvider;
	public void setMessageProvider(IMessageProvider messageProvider) {
		this.messageProvider = messageProvider;
	}
	
	public void display() {
		System.out.println("Message: " + messageProvider.getMessage());
	}	
}
