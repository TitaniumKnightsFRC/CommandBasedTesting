package org.usfirst.frc.team6203.robot.commands;

import org.usfirst.frc.team6203.robot.OI;
import org.usfirst.frc.team6203.robot.subsystems.Chassis;
import org.usfirst.frc.team6203.robot.subsystems.Shooter;
import org.usfirst.frc.team6203.robot.subsystems.TitaniumCamera;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public abstract class CommandBase extends Command {

	   public static OI oi;
	    // Create a single static instance of all of your subsystems
	    public static Chassis chassis = new Chassis();
	    public static Shooter shooter = new Shooter();
	    public static TitaniumCamera camera = new TitaniumCamera();
	    
	    
	    public static void init() {
	        // This MUST be here. If the OI creates Commands (which it very likely
	        // will), constructing it during the construction of CommandBase (from
	        // which commands extend), subsystems are not guaranteed to be
	        // yet. Thus, their requires() statements may grab null pointers. Bad
	        // news. Don't move it.
	        oi = new OI();

	        // Show what command your subsystem is running on the SmartDashboard
	        SmartDashboard.putData("SchedulerData", Scheduler.getInstance());
	        SmartDashboard.putData(chassis);
	    }

	    public CommandBase(String name) {
	        super(name);
	    }

	    public CommandBase() {
	        super();
	    }
}
