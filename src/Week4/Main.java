package Week4;

/**
 * Created by leyla on 19/10/15.
 */
public class Main {
    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
        boolean sucsess = false;

        for (int i = 0; i < 3; i++) {
            RobotConnection connection = null;
            try {
                connection = robotConnectionManager.getConnection();
                connection.moveRobotTo(toX, toY);
                sucsess = true;
            } catch (RobotConnectionException e) {

            } finally {
                if (connection != null) {
                    try {
                        connection.close();
                    } catch (RobotConnectionException e) {

                    }
                }
            }
            if (sucsess) {
                return;
            }
        }
        if (sucsess == false) {
            throw new RobotConnectionException("Computer says no");
        }
    }
}
