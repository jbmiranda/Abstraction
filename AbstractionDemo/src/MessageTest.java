
public class MessageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IMessageProvider mp = new MessageProvider();
		IMessageRenderer mr = new MessageRenderer();
		mr.setMessageProvider(mp);
		mr.display();
		
		mp = new DatabaseMessageProvider();
		mr.setMessageProvider(mp);
		mr.display();
	}

}
