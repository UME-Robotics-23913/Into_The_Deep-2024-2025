package org.firstinspires.ftc.teamcode.Help;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

public class Help1 extends OpMode {
    private static DcMotor _arm;
    public static void initialize() {
        //Help2.Move();
        //Help2.tnp = 10;
   // un();
        //_arm = hardwareMap.get(DcMotor.class, "arm");
        _arm.setDirection(DcMotorSimple.Direction.FORWARD);

        _arm.setPower(.5);
    }

    @Override
    public void init() {
        initialize();
    }

    @Override
    public void loop() {

    }
}
