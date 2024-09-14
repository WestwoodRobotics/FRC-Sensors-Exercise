package frc.robot.sensors;

import edu.wpi.first.wpilibj.ADIS16470_IMU;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

/**
 * The IMU class represents an Inertial Measurement Unit sensor subsystem.
 * It provides methods to initialize the sensor, read sensor data, and handle errors.
 */
public class IMU extends SubsystemBase {

    private ADIS16470_IMU imu;

    /**
     * Constructs an IMU object.
     */
    public IMU() {
        // TODO: Initialize the IMU sensor
        // Hint: Use the ADIS16470_IMU class to construct the IMU object
    }

    /**
     * Reads the yaw angle from the IMU sensor.
     * 
     * @return The yaw angle in degrees.
     */
    public double getYaw() {
        // TODO: Implement reading yaw angle from the IMU sensor
        // Hint: Use the getAngle() method from the ADIS16470_IMU class
        return 0.0;
    }

    /**
     * Reads the pitch angle from the IMU sensor.
     * 
     * @return The pitch angle in degrees.
     */
    public double getPitch() {
        // TODO: Implement reading pitch angle from the IMU sensor
        // Hint: Use the getPitch() method from the ADIS16470_IMU class
        return 0.0;
    }

    /**
     * Reads the roll angle from the IMU sensor.
     * 
     * @return The roll angle in degrees.
     */
    public double getRoll() {
        // TODO: Implement reading roll angle from the IMU sensor
        // Hint: Use the getRoll() method from the ADIS16470_IMU class
        return 0.0;
    }

    @Override
    public void periodic() {
        // This method will be called once per scheduler run
        // Use the SmartDashboard to put the yaw number onto the dashboard
    }
}
