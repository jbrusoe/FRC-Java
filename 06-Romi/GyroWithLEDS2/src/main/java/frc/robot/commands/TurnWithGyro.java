// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Drivetrain;

public class TurnWithGyro extends CommandBase {
  private Drivetrain DT;
  private int DegreesToTurn;
  private int LoopCount = 0;
  
  /** Creates a new TurnWithGyro. */
  public TurnWithGyro(Drivetrain DT, int DegreesToTurn) {
    // Use addRequirements() here to declare subsystem dependencies.
    this.DT = DT;
    this.DegreesToTurn = DegreesToTurn;
    addRequirements(DT);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    DT.resetGyro();
    LoopCount= 0;
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    if (LoopCount < 100) {
      DT.arcadeDrive(0.5, 0);
    }
    else {
      DT.arcadeDrive(0, 0.4);
    }
    
    LoopCount++;
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    DT.arcadeDrive(0, 0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return DT.getGyroAngleZ() > DegreesToTurn;
  }
}
