package Week3;

/**
 * На игровом поле находится робот.
 * Позиция робота на поле описывается двумя целочисленным координатами: X и Y.
 * Ось X смотрит слева направо, ось Y — снизу вверх. (Помните, как рисовали графики функций в школе?)
 * <p/>
 * В начальный момент робот находится в некоторой позиции на поле.
 * Также известно, куда робот смотрит: вверх, вниз, направо или налево.
 * Ваша задача — привести робота в заданную точку игрового поля.
 * <p/>
 * Робот описывается классом Robot. Вы можете пользоваться следующими его методами (реализация вам неизвестна):
 * public class Robot {
 * <p/>
 * public Direction getDirection() // текущее направление взгляда
 * public int getX() // текущая координата X
 * public int getY() // текущая координата Y
 * public void turnLeft() // повернуться на 90 градусов против часовой стрелки
 * public void turnRight() // повернуться на 90 градусов по часовой стрелке
 * public void stepForward() // шаг в направлении взгляда // за один шаг робот изменяет одну свою координату на единицу
 * <p/>
 * Direction, направление взгляда робота,  — это перечисление:
 * public enum Direction {
 * UP,
 * DOWN,
 * LEFT,
 * RIGHT
 * }
 * <p/>
 * Пример
 * <p/>
 * В метод передано: toX == 3, toY == 0;
 * начальное состояние робота такое: robot.getX() == 0, robot.getY() == 0, robot.getDirection() == Direction.UP
 * <p/>
 * Чтобы привести робота в указанную точку (3, 0), метод должен вызвать у робота следующие методы:
 * <p/>
 * robot.turnRight();
 * robot.stepForward();
 * robot.stepForward();
 * robot.stepForward();
 */
enum Direction {
    UP,
    DOWN,
    LEFT,
    RIGHT
}

public class Robot {

    public Direction getDirection() {
       return null;
    }

    public int getX() {
        return 0;
    }

    public int getY() {
        return 0;
    }

    public void turnLeft() {
        return ;
    }

    public void turnRight() {
        return ;
    }

    public void stepForward() {
        return ;
    }

    public static void moveRobot(Robot robot, int toX, int toY) {
        robot.stepForward();
        int x = robot.getX();
        int y = robot.getY();
        Direction dir = robot.getDirection();
        if (toX != x) {
            if (x > toX) {
                switch (dir) {
                    case UP:
                        robot.turnLeft();
                        break;
                    case DOWN:

                        robot.turnRight();
                        break;
                    case LEFT:
                        break;
                    case RIGHT:
                        robot.turnRight();
                        robot.turnRight();
                        break;

                }
                dir = Direction.LEFT;
                for (int i = 0; i < Math.abs(x - toX); i++) {
                    robot.stepForward();
                }

            } else {
                switch (dir) {
                    case UP:
                        robot.turnRight();
                        break;
                    case DOWN:
                        robot.turnLeft();
                        break;
                    case LEFT:
                        robot.turnRight();
                        robot.turnRight();
                        break;
                    case RIGHT:
                        break;

                }
                dir = Direction.RIGHT;
                for (int i = 0; i < Math.abs(x - toX); i++) {
                    robot.stepForward();
                }

            }
        }
        if (toY != y) {
            if (y > toY) {
                switch (dir) {
                    case UP:
                        robot.turnLeft();
                        robot.turnLeft();
                        break;
                    case DOWN:
                        break;
                    case LEFT:
                        robot.turnLeft();
                        break;
                    case RIGHT:
                        robot.turnRight();
                        break;

                }
                for (int i = 0; i < Math.abs(y - toY); i++) {
                    robot.stepForward();
                }

            } else {
                switch (dir) {
                    case UP:
                        break;
                    case DOWN:
                        robot.turnLeft();
                        robot.turnLeft();
                        break;
                    case LEFT:
                        robot.turnRight();
                        break;
                    case RIGHT:
                        robot.turnLeft();
                        break;

                }
                for (int i = 0; i < Math.abs(y - toY); i++) {
                    robot.stepForward();
                }

            }

        }
    }
}
