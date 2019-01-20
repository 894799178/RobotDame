import Service.RobotService;
import ServiceImpl.RobotServiceImpl;

import java.awt.*;

public class Main {

    public static RobotService robotService = new RobotServiceImpl();
    public static void main(String[] args) throws AWTException {
        Robot robot=new Robot();
        robotService.mouseClick(robot,1000,500);
    }

}