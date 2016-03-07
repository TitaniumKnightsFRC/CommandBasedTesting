package org.usfirst.frc.team6203.robot.subsystems;

import org.usfirst.frc.team6203.robot.RobotMap;
import org.usfirst.frc.team6203.robot.commands.OpTankDrive;

import edu.wpi.first.wpilibj.Gyro;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Chassis extends Subsystem {

	private double speed;
	public final Victor leftMotorF;
	public final Victor leftMotorB;
	public final Victor rightMotorF;
	public final Victor rightMotorB;
	public final RobotDrive drive;
	public final Gyro gyro;

	public Chassis() {

		leftMotorF = new Victor(RobotMap.leftMotorF);
		leftMotorB = new Victor(RobotMap.leftMotorB);
		rightMotorF = new Victor(RobotMap.rightMotorF);
		rightMotorB = new Victor(RobotMap.rightMotorB);
		drive = new RobotDrive(leftMotorF, rightMotorF, leftMotorB, rightMotorB);
		gyro = new Gyro(RobotMap.kGyro);
	}

	// Put methods for controlling this subsystem
	// here. Call these from Commands.

	public void tankDrive(Joystick xbox) {
		drive.tankDrive(xbox.getRawAxis(2), xbox.getRawAxis(5));
	}

	public void shiftDrive(double d, double e) {
		// TODO Auto-generated method stub
		drive.drive(d, e);
		

	}

	public double getAngle() {
		return gyro.getAngle();
	}

	public void simpleDrive(double speed) {
		drive.drive(speed, 0);
	}

	// public void drive(Joystick xbox){
	// drive.arcadeDrive(xbox);
	// }

	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
		setDefaultCommand(new OpTankDrive());
	}

}
