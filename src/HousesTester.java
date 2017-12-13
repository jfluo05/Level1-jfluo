import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class HousesTester {
public static void main(String[] args) {
	Robot h= new Robot("mini");
	h.setPenWidth(10);
	h.setSpeed(100);
	h.setAngle(0);
	h.penDown();
	h.move(100);
	h.turn(90);
	h.move(40);
	h.turn(90);
	h.move(100);
	h.setPenColor(Color.green);
	h.turn(270);
	h.move(30);
	
}
}
