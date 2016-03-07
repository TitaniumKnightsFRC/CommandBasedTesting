package org.usfirst.frc.team6203.robot;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	// MOTORS
	
		//Shooter
		public static int shooterMotor = 12;
		
		//Drive
		public static int leftMotorF = 6;
		public static int leftMotorB = 7;
		public static int rightMotorF = 8;
		public static int rightMotorB = 9;

		// SENSORS
		public static int kEncoderDIO = 0;
		public static int kEncoderDIO1 = 2;

		public static int kUltraDIO = 8;
		public static int kUltraDIO1 = 9;

		public static int kGyro = 1;

		public static int kPotentiometer = 1;
		

		// INTERFACE
		public static int xboxController = 2;
}
