package com.team4099.falconcamps.commands.shooter;

import com.team4099.falconcamps.subsystems.ShooterPIDSubsystem;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class ShooterPIDSubsystemIdleCommand extends CommandBase {
    private final ShooterPIDSubsystem shooter;

    public ShooterPIDSubsystemIdleCommand(ShooterPIDSubsystem shooter) {
        this.shooter = shooter;
        this.addRequirements(shooter);
    }

    @Override
    public void initialize() {

    }
}
