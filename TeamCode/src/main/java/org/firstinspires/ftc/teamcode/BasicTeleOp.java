package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@TeleOp(name="Basic: TeleOpMode", group="TeleOp")
public class BasicTeleOp extends LinearOpMode {

    private Hardware robot = new Hardware();

    private double backLeftPower;
    private double backRightPower;
    private double frontLeftPower;
    private double frontRightPower;
    private double intakePower;


    private double drive;
    private double strafe;
    private double turn;

    // private double arm;

    @Override
    public void runOpMode() throws InterruptedException {
        telemetry.addData("Status", "Initialized");
        telemetry.update();

        robot.initialize(this.hardwareMap);

        waitForStart();
         // drive is controlled by up and down, strafe and turn are controlled by left and right.
        while(opModeIsActive()) {
            drive = gamepad1.left_stick_y;
            strafe = gamepad1.left_stick_x;
            turn = gamepad1.right_stick_x;

            // armPower = gamepad1.right_stick_x;

            frontLeftPower = drive - strafe - turn;
            frontRightPower = drive + strafe + turn;
            backLeftPower = drive + strafe - turn;
            backRightPower = drive - strafe + turn;
            // all the wheels and their power
            double max = Math.max(
                 1,
                    Math.max(
                            Math.max(
                                    Math.abs(backLeftPower),
                                    Math.abs(backRightPower)),
                            Math.max(
                                    Math.abs(frontLeftPower),
                                    Math.abs(frontRightPower)

                                    // Math.abs(armPower)
                            )
                    )
            );

            // abs = absolute values
            backLeftPower /= max;
            backRightPower /= max;
            frontRightPower /= max;
            frontLeftPower /= max;

            // armPower /= max;

            if(gamepad1.right_bumper)
                intakePower = 1;

            if(gamepad1.left_bumper)
                intakePower = -1;

            if (!gamepad1.right_bumper && !gamepad1.left_bumper)
                intakePower = 0;

            robot.backLeft.setPower(backLeftPower);
            robot.backRight.setPower(backRightPower);
            robot.frontLeft.setPower(frontLeftPower);
            robot.frontRight.setPower(frontRightPower);

            robot.intake.setPower(intakePower);

        }
    }
}
