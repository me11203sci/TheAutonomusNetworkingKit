package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Servo;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.TalonSRXControlMode;

public class Robot extends TimedRobot
{
	// Declare global variables.
	Joystick controller = new Joystick(0);
	WPI_TalonSRX leftMaster = new WPI_TalonSRX(1);
	WPI_TalonSRX leftFollower = new WPI_TalonSRX(2);
	WPI_TalonSRX rightMaster = new WPI_TalonSRX(3);
	WPI_TalonSRX rightFollower = new WPI_TalonSRX(4);
	Encoder leftEncoder = new Encoder(0,1);
	Encoder rightEncoder = new Encoder(2,3);
	Servo limeLightPivot = new Servo(0);

	@Override
	public void robotInit()
	{
		// Configure encoders.
		leftEncoder.setReverseDirection(true);
		rightEncoder.setReverseDirection(false);
		leftEncoder.setDistancePerPulse(Math.PI * 6 / 360);
		rightEncoder.setDistancePerPulse(Math.PI * 6 / 360);

		// Configure Follower Talons.
		leftFollower.set(TalonSRXControlMode.Follower, leftMaster.getDeviceID());
		rightFollower.set(TalonSRXControlMode.Follower, rightMaster.getDeviceID());

		// Set initial position of the camera.
		limeLightPivot.setAngle(0);
	}

	@Override
	public void robotPeriodic()
	{

	}

	@Override
	public void autonomousInit()
	{

	}

	@Override
	public void autonomousPeriodic()
	{

	}

	@Override
	public void teleopInit()
	{

	}

	@Override
	public void teleopPeriodic()
	{
		// Read controller inputs and calculate values.
		double linearSpeed = controller.getRawAxis(4);
		double turningSpeed = -controller.getRawAxis(1);
		double leftSideSpeed = linearSpeed + turningSpeed;
		double rightSideSpeed = linearSpeed - turningSpeed;
		double servoPosition = limeLightPivot.getAngle() + (controller.getRawAxis(3) - controller.getRawAxis(2)) * 5;

		// Assign speeds and positions.
		leftMaster.set(leftSideSpeed);
		rightMaster.set(rightSideSpeed);
		limeLightPivot.setAngle(servoPosition);
	}

	@Override
	public void disabledInit()
	{

	}

	@Override
	public void disabledPeriodic()
	{

	}

	@Override
	public void testInit()
	{

	}

	@Override
	public void testPeriodic()
	{

	}
}