package osu.p16240.diploma.behavior;

import lejos.hardware.Button;
import lejos.robotics.subsumption.Behavior;

public class Exit implements Behavior {

	@SuppressWarnings("unused")
	private boolean suppressed = false;

	@Override
	public boolean takeControl() {
		return Button.ESCAPE.isDown();
	}

	@Override
	public void action() {
	System.exit(0);

	}

	@Override
	public void suppress() {
		suppressed = true;
	}

}
