import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Practice implements MouseListener{
	JFrame frame= new JFrame();
	JPanel panel= new JPanel();
	JButton button= new JButton();
	JLabel label= new JLabel();
public static void main(String[] args) {
	Practice practice= new Practice();
	practice.buildGUI();
}
void buildGUI() {
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	panel.add(label);
	label.setText("Jessica");
	
	panel.add(button);
	button.setText("Rename");
	button.addMouseListener(this);
	
	frame.add(panel);
	
	frame.setVisible(true);
	frame.pack();
	
}
@Override
public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub
	System.out.println("Oh no! I have been clicked!!! =0)");
	label.getText("Jordan");
}
@Override
public void mousePressed(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseReleased(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseEntered(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseExited(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
}
