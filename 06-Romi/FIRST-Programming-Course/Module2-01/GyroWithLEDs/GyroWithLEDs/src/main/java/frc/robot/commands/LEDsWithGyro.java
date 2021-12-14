// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Drivetrain;
import frc.robot.subsystems.OnBoardIO;

public class LEDsWithGyro extends CommandBase {
  Drivetrain DT;
  OnBoardIO IO;

  /** Creates a new LEDsWithGyro. */
  public LEDsWithGyro(Drivetrain DT, OnBoardIO IO) {
    this.DT = DT;
    this.IO = IO;

    addRequirements(DT, IO);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    IO.setGreenLed(false);
    IO.setRedLed(false);
    DT.resetGyro();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    if (DT.getGyroAngleZ() >= 10) {
      IO.setGreenLed(true);
      IO.setRedLed(false);
    }
    else if (DT.getGyroAngleZ() <= -10) {
      IO.SetGreenLED(false);
      IO.setRedLed(true);
    }
    else {
      IO.setGreenLed(false);
      IO.setRedLed(false);
    }
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    IO.setGreenLed(false);
    IO.setRedLed(false);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return Math.abs(DT.getGyroAngleZ()) >= 90;
  }
}
