public class Main{

    private static Robot robot = Robot.getInstance();
    //made static object for robot class so it doesnt grab the instance of robot every time

    public static void main(String[] args){
        
        //Robot.getInstance().init();
        robot.init();
        //pseudo robot initialize

        while(true){
            //Robot.getInstance().periodic();
            robot.periodic();
            //pseudo robot periodic
        }
    }

    //dont touchy! this file is only used to initialize and loop robot code
    //multi - file project for cool stuffs because frigg python
}