package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

// A required section to write all of your code
public abstract class Hardware extends OpMode {
    // Makes an instance of DCMotor to create copies
    public static DcMotor frontRight, frontLeft, backRight, backLeft;

    // Creates an area to change the copied class
    public static void Initialize(HardwareMap hMap) {
        // Gets the port of motor from phone to set this instance to that port
        frontRight = hMap.get(DcMotor.class, "frontRight");
        backRight = hMap.get(DcMotor.class, "backRight");
        frontLeft = hMap.get(DcMotor.class, "frontLeft");
        backLeft = hMap.get(DcMotor.class, "backLeft");

        // Sets the direction of motor
        frontRight.setDirection(DcMotor.Direction.FORWARD);
        frontLeft.setDirection(DcMotor.Direction.REVERSE);
        backRight.setDirection(DcMotor.Direction.FORWARD);
        backLeft.setDirection(DcMotor.Direction.REVERSE);

        frontRight.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        frontLeft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        backRight.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        backLeft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
    }

}