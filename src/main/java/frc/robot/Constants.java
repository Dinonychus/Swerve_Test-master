package frc.robot;

import edu.wpi.first.math.geometry.Translation2d;
import edu.wpi.first.math.kinematics.SwerveDriveKinematics;
import edu.wpi.first.math.trajectory.TrapezoidProfile;
import edu.wpi.first.math.util.Units;

public final class Constants {

    public static final class ModuleConstants {
        public static final double kWheelDiameterMeters = Units.inchesToMeters(4);
        public static final double kDriveMotorGearRatio = 1 / 5.8462; //5.8462
        public static final double kTurningMotorGearRatio = 1 / 18.0;
        public static final double kDriveEncoderRot2Meter = kDriveMotorGearRatio * Math.PI * kWheelDiameterMeters;
        public static final double kTurningEncoderRot2Rad = kTurningMotorGearRatio * 2 * Math.PI;
        public static final double kDriveEncoderRPM2MeterPerSec = kDriveEncoderRot2Meter / 60;
        public static final double kTurningEncoderRPM2RadPerSec = kTurningEncoderRot2Rad / 60;
        public static final double kPTurning = .2;
    }

    public static final class DriveConstants {

        public static final double kTrackWidth = Units.inchesToMeters(30);
        // Distance between right and left wheels
        public static final double kWheelBase = Units.inchesToMeters(30);
        // Distance between front and back wheels
       /* public static final SwerveDriveKinematics kDriveKinematics = new SwerveDriveKinematics(
                new Translation2d(-kWheelBase / 2, kTrackWidth / 2),
                new Translation2d(kWheelBase / 2, kTrackWidth / 2),
                new Translation2d(kWheelBase / 2,- kTrackWidth / 2),
                new Translation2d(-kWheelBase / 2,- kTrackWidth / 2));*/
                public static final Translation2d m_frontLeftLocation = new Translation2d(-0.381, 0.381);
                public static final Translation2d m_frontRightLocation = new Translation2d(-0.381, -0.381);
                public static final Translation2d m_backLeftLocation = new Translation2d(0.381, 0.381);
                public static final Translation2d m_backRightLocation = new Translation2d(0.381, -0.381);
            
             public  static final SwerveDriveKinematics kDriveKinematics =
                new SwerveDriveKinematics(
                    m_frontLeftLocation, m_frontRightLocation, m_backLeftLocation, m_backRightLocation);
            

        public static final int kFrontLeftDriveMotorPort = 1; //3
        public static final int kBackLeftDriveMotorPort = 7; //1
        public static final int kFrontRightDriveMotorPort = 3; //5
        public static final int kBackRightDriveMotorPort = 5; //7

        public static final int kFrontLeftTurningMotorPort = 2; //8
        public static final int kBackLeftTurningMotorPort = 8; //2
        public static final int kFrontRightTurningMotorPort = 4; //4
        public static final int kBackRightTurningMotorPort = 6; //6

        public static final boolean kFrontLeftTurningEncoderReversed = true;
        public static final boolean kBackLeftTurningEncoderReversed = true;
        public static final boolean kFrontRightTurningEncoderReversed = true;
        public static final boolean kBackRightTurningEncoderReversed = true;

        public static final boolean kFrontLeftDriveEncoderReversed = true;
        public static final boolean kBackLeftDriveEncoderReversed = true;
        public static final boolean kFrontRightDriveEncoderReversed = false;
        public static final boolean kBackRightDriveEncoderReversed = false;

        public static final int kFrontLeftDriveAbsoluteEncoderPort = 0;
        public static final int kBackLeftDriveAbsoluteEncoderPort = 2;
        public static final int kFrontRightDriveAbsoluteEncoderPort = 1;
        public static final int kBackRightDriveAbsoluteEncoderPort = 3;

        public static final boolean kFrontLeftDriveAbsoluteEncoderReversed = true;
        public static final boolean kBackLeftDriveAbsoluteEncoderReversed = true;
        public static final boolean kFrontRightDriveAbsoluteEncoderReversed = true;
        public static final boolean kBackRightDriveAbsoluteEncoderReversed = true;

       public static final double voltsToDegrees = 5/360;


        public static final double kFrontLeftDriveAbsoluteEncoderOffsetRad = -Math.toRadians( 2.686/ voltsToDegrees);

        public static final double kFrontRightDriveAbsoluteEncoderOffsetRad = -Math.toRadians(0.880 / voltsToDegrees);

        public static final double kBackLeftDriveAbsoluteEncoderOffsetRad = -Math.toRadians(1.168 / voltsToDegrees); //2.0945

        public static final double kBackRightDriveAbsoluteEncoderOffsetRad = -Math.toRadians(4.656 / voltsToDegrees);

        public static final double kPhysicalMaxSpeedMetersPerSecond = 5;
        public static final double kPhysicalMaxAngularSpeedRadiansPerSecond = 2 * 2 * Math.PI;

        public static final double kTeleDriveMaxSpeedMetersPerSecond = kPhysicalMaxSpeedMetersPerSecond / 4;
        public static final double kTeleDriveMaxAngularSpeedRadiansPerSecond = //
                kPhysicalMaxAngularSpeedRadiansPerSecond / 4;
        public static final double kTeleDriveMaxAccelerationUnitsPerSecond = 3;
        public static final double kTeleDriveMaxAngularAccelerationUnitsPerSecond = 3;
    }

    public static final class AutoConstants {
        public static final double kMaxSpeedMetersPerSecond = DriveConstants.kPhysicalMaxSpeedMetersPerSecond / 4;
        public static final double kMaxAngularSpeedRadiansPerSecond = //
                DriveConstants.kPhysicalMaxAngularSpeedRadiansPerSecond / 10;
        public static final double kMaxAccelerationMetersPerSecondSquared = 3;
        public static final double kMaxAngularAccelerationRadiansPerSecondSquared = Math.PI / 4;
        public static final double kPXController = 1.5;
        public static final double kPYController = 1.5;
        public static final double kPThetaController = 3;

        public static final TrapezoidProfile.Constraints kThetaControllerConstraints = //
                new TrapezoidProfile.Constraints(
                        kMaxAngularSpeedRadiansPerSecond,
                        kMaxAngularAccelerationRadiansPerSecondSquared);
    }

    public static final class OIConstants {
        public static final int driveController = 0;

        public static final int LEFT_Y = 1;
        public static final int LEFT_X = 0;
        public static final int RIGHT_X = 4;
        public static final int kDriverFieldOrientedButtonIdx = 8;

        public static final double kDeadband = 0.1;
    }
}