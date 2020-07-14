package com.team4099.falconcamps.subsystems;

import com.revrobotics.*;

import edu.wpi.first.wpilibj.controller.PIDController;
import edu.wpi.first.wpilibj2.command.PIDSubsystem;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ShooterPIDSubsystem extends PIDSubsystem {
    private final CANSparkMax shooterLeader = new CANSparkMax(1, CANSparkMaxLowLevel.MotorType.kBrushless);
    private final CANSparkMax shooterFollower = new CANSparkMax(14, CANSparkMaxLowLevel.MotorType.kBrushless);
    private final CANEncoder shooterEncoder = shooterLeader.getEncoder();

    public ShooterPIDSubsystem() {
        super(new PIDController(1.7/ 300, 0.0, 5.5 * 14000));
    }
    public double getCurrentVelocity() {
        return shooterEncoder.getVelocity();
    }
    
    public double getMeasurement() {
        return getCurrentVelocity();
    }
    public void useOutput(double setPoint,double output) {
        shooterLeader.set(output);
    }
    

    @Override
    public void periodic() {}
}
