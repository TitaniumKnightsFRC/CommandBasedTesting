package org.usfirst.frc.team6203.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class SpeedBoost extends CommandBase {

    public SpeedBoost() {
        // Use requires() here to declare subsystem dependencies
        requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	chassis.leftMotorF.set(.5);
    	chassis.leftMotorB.set(.5);
    	chassis.rightMotorF.set(.5);
    	chassis.rightMotorB.set(.5);
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
