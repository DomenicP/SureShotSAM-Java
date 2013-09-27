package org.lunatecs316.frc2013.commands;

/**
 * Extends the climbing hooks
 * @author domenicpaul
 */
public class ExtendHooks extends CommandBase {
    
    public ExtendHooks() {
        // Use requires() here to declare subsystem dependencies
        requires(climber);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        climber.raiseHooks();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
        climber.lowerHooks();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        end();
    }
}