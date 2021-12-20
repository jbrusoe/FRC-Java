// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Drivetrain;
import frc.robot.subsystems.OnBoardIO;

public class TurnWithGyro extends CommandBase {

  Drivetrain DT;
  OnBoardIO IO;
  int TurnAngle = 0;

  /** Creates a new TurnWithGyro. */
  public TurnWithGyro(Drivetrain DT, OnBoardIO IO, int TurnAngle) {
    this.DT = DT;
    this.IO = IO;
    this.TurnAngle = TurnAngle;
  
    addRequirements(DT,IO);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    IO.setGreenLed(false);
    IO.setRedLed(false);
    IO.setYellowLed(false);
    DT.resetEncoders();
    DT.resetGyro();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    if (DT.getGyroAngleZ() <= TurnAngle) {
      DT.arcadeDrive(0, 0.5);
    }
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
