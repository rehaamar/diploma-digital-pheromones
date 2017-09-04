package osu.p16240.diploma.behavior;

import lejos.hardware.motor.Motor;
import lejos.hardware.port.Port;
import lejos.robotics.subsumption.Behavior;
import osu.p16240.diploma.sensors.UltraSonicSensor;

public class HitWall implements Behavior {
	// private TouchSensor touch;
	private UltraSonicSensor sonar;
	private boolean suppressed = false;

	public HitWall(Port port) {
		sonar = new UltraSonicSensor(port);
	}

	public boolean takeControl() {
       return sonar.getRange() < 0.25;
    }

	public void suppress() {
		suppressed = true;
	}

	public void action() {
		suppressed = false;
		Motor.A.rotate(-180, true);
		Motor.C.rotate(-360, true);

		while (Motor.C.isMoving() && !suppressed)
			Thread.yield();

		Motor.A.stop();
		Motor.C.stop();
	}
}