package osu.p16240.diploma.sandbox;

import java.util.ArrayList;
import java.util.Iterator;

import lejos.hardware.ev3.LocalEV3;
import lejos.hardware.lcd.LCD;
import lejos.hardware.port.Port;
import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.hardware.sensor.SensorModes;
import lejos.robotics.SampleProvider;
import lejos.robotics.filter.MeanFilter;
import lejos.utility.Delay;

public class MyFirstRobot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LCD.drawString("Lets start!", 0, 4);
		Delay.msDelay(200);
		
		
		// get a port instance
		Port port = LocalEV3.get().getPort("S2");

		// Get an instance of the Ultrasonic EV3 sensor
		SensorModes sensor = new EV3UltrasonicSensor(port);

		// get an instance of this sensor in measurement mode
		
		ArrayList<String> modes = sensor.getAvailableModes();
		
		for (Iterator iterator = modes.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
		
		SampleProvider distance= sensor.getMode("Distance");

		
		
		// stack a filter on the sensor that gives the running average of the last 5 samples
		SampleProvider average = new MeanFilter(distance, 5);

		// initialise an array of floats for fetching samples
		float[] sample = new float[average.sampleSize()];

		for (float f : sample) {
			System.out.println(f);
		}
		
		
		// fetch a sample
		average.fetchSample(sample, 0);
		
		System.out.println(average.toString());
		
		LCD.drawString("Ende !!!!!!", 0, 4);
		Delay.msDelay(5000);
		 
	   
	}

}
