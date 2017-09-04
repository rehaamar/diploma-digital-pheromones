package osu.p16240.diploma;

import lejos.hardware.ev3.LocalEV3;
import lejos.robotics.subsumption.Arbitrator;
import lejos.robotics.subsumption.Behavior;
import osu.p16240.diploma.behavior.DriveForward;
import osu.p16240.diploma.behavior.Exit;
import osu.p16240.diploma.behavior.HitWall;

public class Robot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Behavior b1 = new DriveForward();
		Behavior b2 = new HitWall(LocalEV3.get().getPort("S3"));
		Behavior b3 = new Exit();
		Behavior[] bArray = { b1, b2, b3 };
		Arbitrator arby = new Arbitrator(bArray);
		arby.go();
		
	}

}
