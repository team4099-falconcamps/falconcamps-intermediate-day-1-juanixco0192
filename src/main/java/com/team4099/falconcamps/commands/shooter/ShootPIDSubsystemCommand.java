package com.team4099.falconcamps.commands.shooter;

import com.team4099.falconcamps.subsystems.ShooterPIDSubsystem;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class ShootPIDSubsystemCommand extends CommandBase {
    private final ShooterPIDSubsystem shooter;

    public ShootPIDSubsystemCommand(ShooterPIDSubsystem shooter) {
        this.shooter = shooter;
        this.addRequirements(shooter);
    }

    @Override
    public void initialize() {

    }
}
