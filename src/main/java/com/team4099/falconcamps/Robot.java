package com.team4099.falconcamps;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj2.command.CommandScheduler;

public class Robot extends TimedRobot {
    private final RobotContainer robotContainer = new RobotContainer();

    @Override public void robotInit() {}

    @Override public void autonomousInit() {}

    @Override public void teleopInit() {}

    @Override public void disabledInit() {}

    @Override public void robotPeriodic() {
        CommandScheduler.getInstance().run();
    }

    @Override public void autonomousPeriodic() {}

    @Override public void disabledPeriodic() {}
}
