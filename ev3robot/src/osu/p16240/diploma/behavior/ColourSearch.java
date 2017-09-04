package osu.p16240.diploma.behavior;

import lejos.robotics.subsumption.Behavior;

public class ColourSearch implements Behavior {

	/**
	 * Returns a boolean value to indicate if this behavior should become active.
	 * For example, if a touch sensor indicates the robot has bumped into an object,
	 * this method should return true. This method should return quickly, not
	 * perform a long calculation
	 */
	@Override
	public boolean takeControl() {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * The code in this method begins performing its task when the behavior becomes
	 * active. For example, if takeControl() detects the robot has collided with an
	 * object, the action() code could make the robot back up and turn away from the
	 * object.
	 * 
	 * A behavior is active as long as its action() method is running, so the
	 * action() method should exit when its task is complete. Also, the action()
	 * method should exit promptly when suppress() is called. When it exits, it
	 * should leave the robot in a safe state for the next behavior.
	 */
	@Override
	public void action() {
		// TODO Auto-generated method stub

	}

	/**
	 * The code in the suppress() method should immediately terminate the code
	 * running in the action() method. It also should exit quickly.
	 */

	@Override
	public void suppress() {
		// TODO Auto-generated method stub

	}

}
