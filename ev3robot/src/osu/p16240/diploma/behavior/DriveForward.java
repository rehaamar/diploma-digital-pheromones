package osu.p16240.diploma.behavior;

import lejos.hardware.motor.Motor;
import lejos.robotics.subsumption.Behavior;

public class DriveForward implements Behavior {

	private boolean suppressed = false;

	@Override
	public boolean takeControl() {

		return true;
	}

	@Override
	public void action() {

		suppressed = false;
		Motor.A.forward();
		Motor.C.forward();
		while (!suppressed)
			Thread.yield();
		Motor.A.stop(); // clean up
		Motor.C.stop();
	}

	@Override
	public void suppress() {
		suppressed = true;

	}

}
