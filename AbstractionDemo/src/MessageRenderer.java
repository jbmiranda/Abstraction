
public class MessageRenderer extends BaseMessageRenderer implements IMessageRenderer{	
	@Override
	public void display() {
		System.out.println("Message: " + messageProvider.getMessage());
	}	
}
