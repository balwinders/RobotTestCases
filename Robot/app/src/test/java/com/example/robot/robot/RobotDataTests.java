package com.example.robot.robot;


public class RobotDataTests extends BaseDataTests {

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    // for tessting the movement of robot.
    public void test_Move() {
        double i = 22.00;
        assertEquals(i, Move(22.00));

    }

    // for testing the movement of robot.
    public void test_turn() {

        double angle = 360;
        assertEquals(angle, Turn(360));
    }

    // for testing the movement of robot.
    public void testTurnAndBeep() {

        double angle = 270;
        assertEquals(angle, Turn(270));

        Beep();
    }

    // for testing the movement of robot.
    public void testMOveAndBeep() {

        double i = 2.00;
        assert(i, Move(2.00));

        Beep();
    }

    // for testing the movement and turn of robot.
    public void testTurnAndMove() {

        double i = 10.00;
        double angle = 90;

        assertEquals(angle, Turn(90));
        assertEquals(i, Move(10.00));
    }

    // for testing the movement and turn of robot.
    public void testMOveAndTurnAndBeep() {

        double i = 13.00;
        double angle = 45;

        assertEquals(angle, Turn(45));
        assertEquals(i, Move(13.00));

        Beep();
    }
}
