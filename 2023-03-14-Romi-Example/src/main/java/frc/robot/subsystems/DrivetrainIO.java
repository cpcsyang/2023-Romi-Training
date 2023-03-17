package frc.robot.subsystems;

import org.littletonrobotics.junction.LogTable;
import org.littletonrobotics.junction.inputs.LoggableInputs;

/** Defines the interface for communicating with drivetrain hardware. */
public interface DrivetrainIO {
    /** Contains all of the input data received from drivetrain hardware. */
    public class DrivetrainIOInputs implements LoggableInputs {
        public double leftPositionRadians = 0.0;
        public double rightPositionRadians = 0.0;
        public double gyroPositionRadians = 0.0;
    }

    @Override
    public void toLog(LogTable table) {
        // TODO Auto-generated method
        table.put("LeftPositionRadians", leftPositionRadians);
        table.put("RightPositionRadians", rightPositionRadians);
        table.put("GyroPositionRadians", gyroPositionRadians);
    }

    @Override
    public void fromLog(LogTable table) {
        // TODO Auto-generated method stub
        leftPositionRadians = table.getDouble("LeftPositionRadians", leftPositionRadians);
        rightPositionRadians = table.getDouble("RightPositionRadians", rightPositionRadians);
        gyroPositionRadians = table.getDouble("GyroPositionRadians", gyroPositionRadians);
    }
}
