package com.team4099.falconcamps.commands.shooter;

import com.team4099.falconcamps.subsystems.ShooterSparkPID;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class ShooterSparkPIDIdleCommand extends CommandBase {
    private final ShooterSparkPID shooter;

    public ShooterSparkPIDIdleCommand(ShooterSparkPID shooter) {
        this.shooter = shooter;
        this.addRequirements(shooter);
    }

    @Override
    public void initialize() {}
}
