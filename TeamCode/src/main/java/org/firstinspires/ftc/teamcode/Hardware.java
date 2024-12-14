    package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

// A required section to write all of your code
public class Hardware {
    // Makes an instance of DCMotor to create copies
    public  DcMotor frontRight, frontLeft, backRight, backLeft;
    // public DcMotor intake, arm;

    // Creates an area to change the copied class
    public void initialize(HardwareMap hMap) {
        // Gets the port of motor from phone to set this instance to that port
        frontRight = hMap.get(DcMotor.class, "frontRight");
        backRight = hMap.get(DcMotor.class, "backRight");
        frontLeft = hMap.get(DcMotor.class, "frontLeft");
        backLeft = hMap.get(DcMotor.class, "backLeft");
        // intake = hMap.get(DcMotor.class, "intake");
        // arm = hMap.get(DcMotor.class, "arm");

        // Sets the direction of motor
        frontRight.setDirection(DcMotor.Direction.FORWARD);
        frontLeft.setDirection(DcMotor.Direction.REVERSE);
        backRight.setDirection(DcMotor.Direction.FORWARD);
        backLeft.setDirection(DcMotor.Direction.REVERSE);
        // intake.setDirection(DcMotor.Direction.REVERSE);
        // arm.setDirection(DcMotor.Direction.REVERSE);

        frontRight.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        frontLeft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        backRight.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        backLeft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        // intake.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        // arm.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
    }

}

