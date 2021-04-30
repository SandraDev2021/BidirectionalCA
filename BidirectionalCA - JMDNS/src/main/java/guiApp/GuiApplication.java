package guiApp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.xml.ws.Service;

/* Gui app tutorial
  //https://beginnersbook.com/2015/07/java-swing-tutorial/
   * 
 */
public class GuiApplication implements ActionListener{
	private static JLabel userLabel;
	private static JTextField userText;
	private static JLabel passwordLabel;
	private static JPasswordField passwordText;
	private static JButton button;
	private static JLabel success;
	private static JPanel panel;
	private static JFrame frame;
	private static JLabel fail;
	
	public static void main (String[] args) {
	// create an object for the panel	
		panel = new JPanel();
		// create an object for the frame	
		frame = new JFrame();
		// configuration of the Frame - it just give me the empty frame
		// the frame is the window (blank)
		frame.setSize(100,100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		
		panel.setLayout(null);
		// create an object for the label	
		userLabel = new JLabel("User");
		userLabel.setBounds(10,20,80,25);
		panel.add(userLabel);
		
		//Text fields
		// create an object for the frame	
		userText = new JTextField();
		userText.setBounds(100,20,165,25);
		panel.add(userText);
		
		// create an object for the label password
		passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(10,50,80,25);
		panel.add(passwordLabel);
		
		//create an object to password text
		passwordText =  new JPasswordField();
		passwordText.setBounds(100,50,165,25);
		panel.add(passwordText);//adding the password text
		
		//creating an obejct to button
		button = new JButton("Login");
		button.setBounds(10,80,80,25);
		button.addActionListener(new GuiApplication());//add an action to the button
		panel.add(button);
		
		
		success = new JLabel("");
		success.setBounds(10,110,300,25);
		panel.add(success);
		
		fail = new JLabel("");
		fail.setBounds(10, 110, 300, 25);
		panel.add(fail);
				
		
		
		frame.setVisible(true);
		
		// create an obect for the panel
		//the panel is the layout
		
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// Which action will be performed when the button is pressed
		/*System.out.println("Button clicked");
		//gives you an output on the console :
		Button clicked	
		 * 
		 */
		String user = userText.getText();
		String password = passwordText.getText();
		System.out.println(user + "," + password);
		
		if(user.equals("Sandra") && password.equals("NewLife")) {
			success.setText("Login Successful !");
		}
		else {
			fail.setText("Credentials don't match");
		}
		if(user.equals("Sandra") && password.equals("NewLife")) {
			
		/*String bonjourServiceType = "_http._tcp.local.";
		Service = JmDNS.create();
		Service.addServiceListener(bonjourServiceType, SimpleServiceListener);
		ServiceInfo[] serviceInfos = Service.list(bonjourServiceType);
		for (ServiceInfo info : serviceInfos) {
		  System.out.println("## resolve service " + info.getName()  + " : " + info.getURL());
		}
		Service.close();*/
			 
		}
		
		
	}// end of action performed
	
	
}