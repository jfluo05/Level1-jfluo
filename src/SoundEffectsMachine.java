import java.applet.AudioClip;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SoundEffectsMachine implements MouseListener {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton drumButton = new JButton();
	JButton cymbalButton= new JButton();
	JButton slotMachineButton= new JButton();
	public static void main(String[] args) {
		SoundEffectsMachine sem = new SoundEffectsMachine();
		sem.buildGUI();
	}

	void buildGUI() {
		frame.setVisible(true);
		frame.setSize(1000, 1000);
		frame.setTitle("Jessica's JFrame");
		frame.add(panel);
		
		
		panel.add(drumButton);
		panel.add(cymbalButton);
		panel.add(slotMachineButton);
		
		
		drumButton.addMouseListener(this);
		slotMachineButton.addMouseListener(this);
		cymbalButton.addMouseListener(this);
		
		drumButton.setText("Drum Sound");
		cymbalButton.setText("Cymbal Sound");
		slotMachineButton.setText("Slot Machine Button");
		frame.setTitle("Sound Effects Machine");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

	public void mouseClicked(MouseEvent e) {
		JButton buttonClicked= (JButton) e.getSource();
		if(buttonClicked==drumButton) {
			playSound("SingleDrumHit.wav");
		}else if(buttonClicked==cymbalButton) {
			playSound("Cymbal.wav");
		}else if(buttonClicked==slotMachineButton) {
			playSound("SlotMachine.wav");
	}
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