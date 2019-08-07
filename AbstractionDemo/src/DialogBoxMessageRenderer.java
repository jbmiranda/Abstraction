import javax.swing.JOptionPane;

public class DialogBoxMessageRenderer extends BaseMessageRenderer implements IMessageRenderer{	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, messageProvider.getMessage());
	}

}
