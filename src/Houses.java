import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
static int hei;
	static Robot h = new Robot("mini");

public static void main(String[] args) {
	
	Random num=new Random();
	int i=0;
	h.setSpeed(100);
	h.turn(180);
	h.move(275);
	h.turn(90);
	h.move(400);
	
	for(i=0;i<10;i++) {
	int c=num.nextInt(5);

	if(c==0) {
		color("pink");
	}else if(c==1) {
		color("magenta");
	}else if(c==2) {
		color("white");
	}else if(c==3) {
		color("cyan");
	}else if(c==4) {
		color("red");
	}
	

		int h=num.nextInt(3);
		if(h==0) {
			house("small");
		}else if(h==1) {
			house("medium");
		}else{
			house("large");
		}
		
	}

}

static void color(String colours) {
	if(colours.equals("pink")) {
	h.setPenColor(Color.PINK);
	}if(colours.equals("magenta")) {
		h.setPenColor(Color.magenta);
		}if(colours.equals("white")) {
			h.setPenColor(Color.WHITE);
		}if(colours.equals("cyan")) {
			h.setPenColor(Color.cyan);
		}if(colours.equals("red")) {
			h.setPenColor(Color.red);
		}
	
}

	static void house(String height) {
		hei=120;
		if (height.equals("small")) {
			hei = 60;
		}
		if (height.equals("medium")) {
			hei = 120;
		}
		if (height.equals("large")) {
			hei = 250;
		}
		h.setWindowColor(Color.BLACK);
		h.setPenWidth(100);
		h.setAngle(0);
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
	static void drawFlatRoof() {
		h.turn(90);
		h.move(40);
		h.turn(90);
	}
	static void drawPointyRoof() {
		h.turn(45);
		h.move(28);
		h.turn(315);
		h.move(28);
		h.turn(45);
	}
	



}
