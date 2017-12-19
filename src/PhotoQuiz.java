// Copyright Wintriss Technical Schools 2013
import java.awt.Component;
import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		Frame quizWindow = new Frame();
		quizWindow.setVisible(true);

// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image URL”)
String image1="https://i.pinimg.com/736x/a7/ab/4d/a7ab4d8aa1c4a0a2fec6a854ee4aed5f--work-funny-quotes-funny-minion-quotes-hilarious-so-true.jpg";
// 2. create a variable of type "Component" that will hold your image
Component imageHolder;
// 3. use the "createImage()" method below to initialize your Component
imageHolder=createImage(image1);
// 4. add the image to the quiz window
quizWindow.add(imageHolder);
// 5. call the pack() method on the quiz window
quizWindow.pack();
quizWindow.setVisible(true);
// 6. ask a question that relates to the image
String whichMinion=JOptionPane.showInputDialog("Which minion is this?");
// 7. print "CORRECT" if the user gave the right answer
if(whichMinion.equalsIgnoreCase("Jerry")) {
	JOptionPane.showMessageDialog(null, "Correct!");
}
// 8. print "INCORRECT" if the answer is wrong
else {
	JOptionPane.showMessageDialog(null, "Incorrect");
}
// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
quizWindow.remove(imageHolder);
// 10. find another image and create it (might take more than one line of code)
String image2="http://pixdaus.com/files/items/pics/0/90/16090_2abd92d4aa01815b76f95ed8dca3dcae_mdsq.jpg";
imageHolder=createImage(image2);
// 11. add the second image to the quiz window
quizWindow.add(imageHolder);
// 12. pack the quiz window
quizWindow.pack();
quizWindow.setVisible(true);
// 13. ask another question


String color=JOptionPane.showInputDialog("Which animal is cuter the mouse or the cat?");

if(color.equalsIgnoreCase("mouse")) {
	JOptionPane.showMessageDialog(null, "Correct!");
}else{
	JOptionPane.showMessageDialog(null, "Incorrect");
}
// 14+ check answer, say if correct or incorrect, etc.

	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
}




