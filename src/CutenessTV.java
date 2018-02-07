import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV implements MouseListener {
	JFrame frame=new JFrame();
	JPanel panel= new JPanel();
	JButton ducklingButton = new JButton();
	JButton frogButton= new JButton();
	JButton unicornButton= new JButton();
	
	public static void main(String[] args) {
		CutenessTV sem = new CutenessTV();
		sem.buildGUI();
	}
	void buildGUI() {
		frame.setVisible(true);
		frame.setSize(1000, 1000);
		frame.setTitle("Jessica's JFrame");
		frame.add(panel);
		
		panel.add(ducklingButton);
		panel.add(frogButton);
		panel.add(unicornButton);
		
		ducklingButton.addMouseListener(this);
		frogButton.addMouseListener(this);
		unicornButton.addMouseListener(this);
		
		ducklingButton.setText("Duckling slide");
		frogButton.setText("Frog Screaming");
		unicornButton.setText("Unicorn Dancing on Rainbows");
		frame.setTitle("Sound Effects Machine");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public void mouseClicked(MouseEvent e) {
		JButton buttonClicked= (JButton) e.getSource();
		if(buttonClicked==ducklingButton) {
			showDucks();
}else if(buttonClicked==frogButton) {
			showFrog();
		}else if(buttonClicked==unicornButton) {
		showFluffyUnicorns();
		}
	}

	private void playSound(String string) {
		// TODO Auto-generated method stub
		
	}
	void showDucks() {
	     playVideo("Drirjl5K9Yk");
	}

	void showFrog() {
	     playVideo("aSjCb-FfxhI");
	}

	void showFluffyUnicorns() {
	     playVideo("qRC4Vk6kisY");
	}

	void playVideo(String videoID) {
	     try {
	          URI uri = new URI("https://youtu.be/" + videoID + "?autoplay=1");
	          java.awt.Desktop.getDesktop().browse(uri);
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
}
	public void mouseClicked1(MouseEvent e) {
		// TODO Auto-generated method stub
		
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
