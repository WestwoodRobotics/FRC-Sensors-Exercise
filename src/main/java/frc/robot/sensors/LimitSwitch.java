package frc.robot.sensors;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

/**
 * The LimitSwitch class represents a limit switch sensor subsystem.
 * It uses a DigitalInput to detect the state of the limit switch.
 */
public class LimitSwitch extends SubsystemBase {

    private DigitalInput limitSwitch;
    private int channel;

    /**
     * Constructs a LimitSwitch object with a specified channel.
     *
     * @param channel The digital input channel the limit switch is connected to.
     */
    public LimitSwitch(int channel) {
        this.channel = channel;
        // TODO: Initialize the limit switch object with the specified channel
        // Hint: Use the DigitalInput class to construct the limit switch object
    }

    /**
     * Returns the state of the limit switch.
     *
     * @return True if the limit switch is pressed, false otherwise.
     */
    public boolean isPressed() {
        // TODO: Return the state of the limit switch
        // Hint: Use the get() method from the DigitalInput class
        return false;
    }

    /**
     * Periodically updates the SmartDashboard with the limit switch state.
     * This method is called automatically to update sensor data on the dashboard.
     */
    @Override
    public void periodic() {
        // TODO: Update the SmartDashboard with the limit switch state
        // Hint: Use the putBoolean() method from the SmartDashboard class
        
    }
}
