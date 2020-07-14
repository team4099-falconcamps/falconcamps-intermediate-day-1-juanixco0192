package com.team4099.falconcamps.subsystems;

import com.revrobotics.*;

import edu.wpi.first.wpilibj.controller.PIDController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ShooterSparkPID extends SubsystemBase {
    private final CANSparkMax shooterLeader = new CANSparkMax(1, CANSparkMaxLowLevel.MotorType.kBrushless);
    private final CANSparkMax shooterFollower = new CANSparkMax(14, CANSparkMaxLowLevel.MotorType.kBrushless);
    private final CANEncoder shooterEncoder = shooterLeader.getEncoder();
    private final CANPIDController pidController = shooterFollower.getPIDController();

    public ShooterSparkPID() {}

    @Override
    public void periodic() {}
}
