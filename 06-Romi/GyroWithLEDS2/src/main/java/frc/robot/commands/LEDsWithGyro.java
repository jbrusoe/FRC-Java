// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Drivetrain;
import frc.robot.subsystems.OnBoardIO;

public class LEDsWithGyro extends CommandBase {
  Drivetrain DT;
  OnBoardIO LEDs;
  /** Creates a new LEDsWithGyro. */
  public LEDsWithGyro(Drivetrain DT, OnBoardIO LEDs) {
    // Use addRequirements() here to declare subsystem dependencies.
    this.DT = DT;
    this.LEDs = LEDs;
    addRequirements(DT,LEDs);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    LEDs.setGreenLed(false);
    LEDs.setRedLed(false);
    LEDs.setYellowLed(false);
    DT.resetGyro();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    if (DT.getGyroAngleZ() >= 10) {
      LEDs.setGreenLed(true);
      LEDs.setRedLed(false);
      LEDs.setYellowLed(false);
    }
    else if (DT.getGyroAngleZ() <= -10) {
      LEDs.setGreenLed(false);
      LEDs.setRedLed(true);
      LEDs.setYellowLed(false);
    }
    else {
      LEDs.setGreenLed(false);
      LEDs.setRedLed(false);
      LEDs.setYellowLed(true);
    }
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    LEDs.setGreenLed(false);
    LEDs.setRedLed(false);
    LEDs.setYellowLed(false);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return Math.abs(DT.getGyroAngleZ()) > 90;
  }
}
