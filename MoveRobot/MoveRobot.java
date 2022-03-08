import java.util.Arrays;

public class MoveRobot {
    public static void main(String[] args) {
        Robot robot = new Robot(0, 0, Direction.UP);
        System.out.println("Start position of robot: (" + robot.getX() + ";" + robot.getY() + ")");
        moveRobot(robot, 5, -4);
        System.out.println("Finish position of robot: (" + robot.getX() + ";" + robot.getY() + ")");
    }

    public static void moveRobot(Robot robot, int toX, int toY) {
        if (toX > robot.getX()) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
            while (robot.getX() != toX) {
                robot.stepForward();
            }
        }
        if (toX < robot.getX()) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
            while (robot.getX() != toX) {
                robot.stepForward();
            }
        }
        if (toY > robot.getY()) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnLeft();
            }
            while (robot.getY() != toY) {
                robot.stepForward();
            }
        }
        if (toY < robot.getY()) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnRight();
            }
            while (robot.getY() != toY) {
                robot.stepForward();
            }
        }
    }

    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }

    public static class Robot {
        int x = 0;
        int y = 0;
        Direction direction = Direction.UP;

        public Robot (int x, int y, Direction dir) {
            this.x = x;
            this.y = y;
            this.direction = dir;
        }

        public Direction getDirection() {
            return direction;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public void turnLeft() {
            switch (getDirection()) {
                default:
                case DOWN:
                    direction = Direction.RIGHT;
                    break;
                case UP:
                    direction = Direction.LEFT;
                    break;
                case RIGHT:
                    direction = Direction.UP;
                    break;
                case LEFT:
                    direction = Direction.DOWN;
            }
        }

        public void turnRight() {
            switch (getDirection()) {
                default:
                case DOWN:
                    direction = Direction.LEFT;
                    break;
                case UP:
                    direction = Direction.RIGHT;
                    break;
                case RIGHT:
                    direction = Direction.DOWN;
                    break;
                case LEFT:
                    direction = Direction.UP;
            }
        }

        public void stepForward() {
            switch (getDirection()) {
                default:
                case RIGHT:
                    x++;
                    break;
                case LEFT:
                    x--;
                    break;
                case UP:
                    y++;
                    break;
                case DOWN:
                    y--;
                    break;
            }
        }
    }
}
