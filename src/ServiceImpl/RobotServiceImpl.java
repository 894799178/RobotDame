package ServiceImpl;

import Service.RobotService;

import java.awt.*;
import java.awt.event.InputEvent;

public class RobotServiceImpl implements RobotService {

    @Override
    public void mouseClick(Robot robot, int x, int y) {
        robot.mouseMove(1000,400);
        robot.mousePress( InputEvent.BUTTON1_MASK );
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        robot.delay(100);
    }
}
