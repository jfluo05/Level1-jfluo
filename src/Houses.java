import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {

	static Robot h = new Robot("mini");

public static void main(String[] args) {
	
	Random num=new Random();
	int i=0;
	h.setSpeed(100);
	h.turn(180);
	h.move(275);
	h.turn(90);
	h.move(400);
	
for(i=0;i<3;i++) {
		int h=num.nextInt(3);
		house(h+100);
		if(h==0) {
		
		}
		
	}

	
}

	static void house(String height) {
		int hei=120;
		if (height.equals("small")) {
			hei = 60;
		}
		if (height.equals("medium")) {
			hei = 120;
		}
		if (height.equals("large")) {
			hei = 250;
		}

		h.setAngle(0);
		h.setPenColor(Color.cyan);
		h.penDown();
		h.move(hei);
		h.turn(90);
		h.move(40);
		h.turn(90);
		h.move(hei);
		h.setPenColor(Color.green);
		h.turn(270);
		h.move(30);

	}
}
