import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class FortuneCookie implements ActionListener{
	
	JLabel label=new JLabel("Click the button to get your fortune!");
	JFrame frame=new JFrame();
	JPanel panel=new JPanel();
	JButton button=new JButton("click");	
	
	void showButton(){
	System.out.println("BUTTON");	
	frame.setDefaultCloseOperation(0);
	panel.add(button);
	button.addActionListener(this);
	panel.add(label);
	frame.add(panel);
	frame.pack();
	frame.setVisible(true);
}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int rand = new Random().nextInt(5);
		if(rand==0) {
			label.setText("You will win HQ trivia tomorrow at 6pm eastern time!$$$$");
		}else if(rand==1) {
			label.setText("You will find $5+ on the gound!=o)");
		}else if(rand==2) {
			label.setText("Your wish will come true :0)");
		}else if(rand==3) {
			label.setText("You will ace your next quiz.Ö");
		}else if(rand==4) {
			label.setText("The most unexpected thing will happen tomorrow.:o)");
		}
frame.pack();
	}
	
	
	
	
	
	
}
