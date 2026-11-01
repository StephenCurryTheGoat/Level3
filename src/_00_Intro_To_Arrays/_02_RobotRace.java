package _00_Intro_To_Arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _02_RobotRace {
    // 1. make a main method
public static void main(String[] args) {
	

        // 2. create an array of 5 robots.
Robot[] rob = new Robot[5];
        // 3. use a for loop to initialize the robots.
for(int i = 0; i < rob.length; i++) {
	rob[i] = new Robot();
	rob[i].setX(200*i);
	rob[i].setY(500);
	rob[i].setAngle(0);
}
        // 4. make each robot start at the bottom of the screen, side by side, facing up
    
        // 5. use another for loop to iterate through the array and make each robot move
        // a random amount less than 50.
boolean won = false;
while(!won) {
	for(int i = 0; i < rob.length; i++) {
		rob[i].move(new Random().nextInt(50));
		if(rob[i].getY() <= 0) {
			System.out.println("Robot " + i + " wins");
			won = true;
		}
		
	}
}
    
        // 6. use a while loop to repeat step 5 until a robot has reached the top of the
        // screen.
    
        // 7. declare that robot the winner and throw it a party!
    
        // 8. try different races with different amounts of robots.
    
        // 9. make the robots race around a circular track.

}
}