package Service;

import java.awt.*;

public interface RobotService {
    /**
     * 利用机器人移动鼠标到某点并按下鼠标左键
     * @param robot 执行方法的机器人
     * @param x
     * @param y
     */
     void mouseClick(Robot robot,int x,int y);


}
