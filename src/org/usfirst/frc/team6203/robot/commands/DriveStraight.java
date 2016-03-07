package org.usfirst.frc.team6203.robot.commands;

import edu.wpi.first.wpilibj.Gyro;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team6203.robot.RobotMap;
import org.usfirst.frc.team6203.robot.commands.CommandBase;

/**
 *
 */
public class DriveStraight extends CommandBase {
	
	double Kp = 0.03;
	
    public DriveStraight() {
        // Use requires() here to declare subsystem dependencies
    	requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	chassis.gyro.reset();
        while (true) {
            double angle = chassis.getAngle(); // get current heading
			chassis.shiftDrive(-1.0, -angle*Kp); // drive towards heading 0
            Timer.delay(0.004);
        }
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
