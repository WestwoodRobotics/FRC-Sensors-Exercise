package frc.robot.sensors;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

/**
 * The DistanceSensor class represents a distance sensor subsystem.
 * It uses an AnalogInput to measure the distance between the sensor and an object.
 */
public class DistanceSensor extends SubsystemBase {

    private AnalogInput distanceSensor;
    private int channel;

    /**
     * Constructs a DistanceSensor object with a specified channel.
     *
     * @param channel The analog input channel the distance sensor is connected to.
     */
    public DistanceSensor(int channel) {
        this.channel = channel;
        // TODO: Initialize the distance sensor object with the specified channel
        // Hint: Use the AnalogInput class to construct the distance sensor object
    }

    /**
     * Returns the current distance measured by the sensor.
     *
     * @return The current distance measured by the sensor.
     */
    public double getDistance() {
        // TODO: Return the current distance measured by the sensor
        // Hint: Use the getVoltage() method from the AnalogInput class
        return 0.0;
    }

    /**
     * Periodically updates the SmartDashboard with the distance sensor data.
     * This method is called automatically to update sensor data on the dashboard.
     */
    @Override
    public void periodic() {
        // TODO: Update the SmartDashboard with the distance measured by the sensor
        // Hint: Use the putNumber() method from the SmartDashboard class
        SmartDashboard.putNumber("Distance Sensor " + channel, getDistance());
    }
}
