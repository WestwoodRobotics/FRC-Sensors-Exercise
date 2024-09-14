package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import com.revrobotics.RelativeEncoder;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

/**
 * The IntakeSubsystem class represents a subsystem for the robot's intake mechanism.
 * It is comprised of a CANSparkMax motor controller and an encoder.
 */
public class IntakeSubsystem extends SubsystemBase {

    private CANSparkMax intakeMotor; //This motor is brushless
    private RelativeEncoder intakeEncoder;

    /**
     * Constructs an IntakeSubsystem object with a specified motor controller ID.
     *
     * @param motorID The CAN ID of the CANSparkMax motor controller.
     */
    public IntakeSubsystem(int motorID) {
        // TODO: Initialize the CANSparkMax motor controller with the specified motor ID
        // Hint: Use the CANSparkMax class to construct the motor controller object


        // TODO: Initialize the encoder object from the motor controller
        // Hint: Use the getEncoder() method from the CANSparkMax class

    }

    /**
     * Sets the power of the intake motor.
     *
     * @param power The power level to set (range: -1.0 to 1.0).
     */
    public void setPower(double power) {
        // TODO: Implement the method to set the power of the intake motor
        // Hint: Use the set() method from the CANSparkMax class

    }

    /**
     * Returns the current velocity of the intake motor using the encoder.
     *
     * @return The current velocity of the intake motor.
     */
    public double getVelocity() {
        // TODO: Implement the method to get the velocity of the intake motor using the encoder
        // Hint: Use the getVelocity() method from the RelativeEncoder class

    }
}
