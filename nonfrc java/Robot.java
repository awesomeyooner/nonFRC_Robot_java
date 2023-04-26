

import utils.RobotBase;

public class Robot extends RobotBase{

    private static Robot instance = new Robot();

    public Robot(){

    }

    public static Robot getInstance(){
        //used by main to call robot
        return instance;
    }

    @Override
    public void init() {
        System.out.println("bobot has initialized!");
    }

    @Override
    public void periodic() {
        System.out.println("bobot is looping!");
    }
}
