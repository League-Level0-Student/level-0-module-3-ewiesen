
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		
		//1. Create a new Robot
		Robot robot = new Robot();
	    //2. Make the robot draw a shape (this will take more than one line of code)
		robot.penDown();
		robot.setSpeed(100);
		for (int i = 0; i < 3; i++) {
		robot.move(100);
		robot.turn(120);
		}
		//3. Set the pen width to 10
		robot.setPenWidth(10);
		//4. Ask the user what color pen they would like the robot to draw with
		String userColor = JOptionPane.showInputDialog("What color would you like?");
		//5. Use an if/else statement to set the pen color that the user requested
		if (userColor == "red") {
			robot.setPenColor(null);
		}
        //6. If the user doesn't enter anything, choose a random color
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		

		



	}
}
