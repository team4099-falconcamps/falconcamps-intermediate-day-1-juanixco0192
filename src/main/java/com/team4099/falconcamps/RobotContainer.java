package com.team4099.falconcamps;

import com.team4099.falconcamps.commands.shooter.ShootPIDSubsystemCommand;
import com.team4099.falconcamps.subsystems.ShooterPIDSubsystem;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.button.Trigger;

public class RobotContainer {
    private final ShooterPIDSubsystem containershooter = new ShooterPIDSubsystem();
    XboxController drivController = new XboxController(0)
    public RobotContainer() {
        new Trigger(driverController::getAButton).whileActive(new ShootPIDSubsystemCommand(containershooter));
        setDefaultCommand
    }
}
