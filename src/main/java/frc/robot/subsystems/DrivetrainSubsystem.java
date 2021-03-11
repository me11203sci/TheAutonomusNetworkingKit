package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class DrivetrainSubsystem extends Subsystem
{
	private volatile static DrivetrainSubsystem _INSTANCE;
	private DifferentialDrive _differentialDrive;
	private static WPI_TalonSRX _leftMaster;
	private static WPI_TalonSRX _rightMaster;

	@SuppressWarnings("WeakerAccess")
	public static DrivetrainSubsystem getInstance()
	{
		// Use "Double Checked Locking" to ensure thread safety and best performance
		// Fast (non-synchronized) check to reduce overhead of acquiring a lock when it's not needed
		if (_INSTANCE == null)
		{
			// Lock to make thread safe
			synchronized (DrivetrainSubsystem.class)
			{
				if (_INSTANCE == null) _INSTANCE = new DrivetrainSubsystem();
			}
		}
		return _INSTANCE;
	}

	private DrivetrainSubsystem()
	{

	}

	@Override
	protected void initDefaultCommand()
	{
		// TODO: Set the default command, if any, for this subsystem by calling setDefaultCommand(command)
		//       e.g. setDefaultCommand(new MyCommand());
	}
}

