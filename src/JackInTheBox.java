import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JackInTheBox extends MouseAdapter{
	
	JButton button = new JButton();
	JFrame frame=new JFrame();
	JPanel panel=new JPanel();
	
public static void main(String[] args) {
	new JackInTheBox().start();
	
}
private void start() {
	
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
	frame.setSize(500, 500);
	frame.setTitle("Jack In The Box");

	frame.add(panel);

	button.setText("Click ME!");
	button.addActionListener((ActionListener) this);
	
	String JackPicture = "JackInTheBox.png";
		
}
public void actionPerformed(ActionEvent arg0) {
	JButton buttonPressed = 
}
}
