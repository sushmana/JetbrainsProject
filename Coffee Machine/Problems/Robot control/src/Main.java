class Move {
    public static void moveRobot(Robot robot, int toX, int toY) {

        boolean walking;
        int step = 1;
        if (checkWin(robot.getX(), robot.getY(), toX, toY)) {
            return;
        }
        do {
            walking = isWalking(robot, toX, toY, step);
            if (!walking) {
                break;
            }
            robot.turnRight();
            walking = isWalking(robot, toX, toY, step);
            if (!walking) {
                break;
            }
            robot.turnRight();
            step++;
            walking = isWalking(robot, toX, toY, step);
            if (!walking) {
                break;
            }
            robot.turnRight();
            walking = isWalking(robot, toX, toY, step);
            robot.turnRight();
            step++;
        } while (walking);
    }

    private static boolean isWalking(Robot robot, int toX, int toY, int step) {
        for (int j = 0; j< step; j++) {
            robot.stepForward();
            if (checkWin(robot.getX(), robot.getY(), toX, toY)) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkWin(int robotX, int robotY, int toX, int toY) {
        return robotX == toX && robotY == toY;
    }
}

//Don't change code below

enum Direction {
    UP(0, 1),
    DOWN(0, -1),
    LEFT(-1, 0),
    RIGHT(1, 0);

    private final int dx;
    private final int dy;

    Direction(int dx, int dy) {
        this.dx = dx;
        this.dy = dy;
    }

    public Direction turnLeft() {
        switch (this) {
            case UP:
                return LEFT;
            case DOWN:
                return RIGHT;
            case LEFT:
                return DOWN;
            case RIGHT:
                return UP;
            default:
                throw new IllegalStateException();
        }
    }

    public Direction turnRight() {
        switch (this) {
            case UP:
                return RIGHT;
            case DOWN:
                return LEFT;
            case LEFT:
                return UP;
            case RIGHT:
                return DOWN;
            default:
                throw new IllegalStateException();
        }
    }

    public int dx() {
        return dx;
    }

    public int dy() {
        return dy;
    }
}

class Robot {
    private int x;
    private int y;
    private Direction direction;

    public Robot(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void turnLeft() {
        direction = direction.turnLeft();
    }

    public void turnRight() {
        direction = direction.turnRight();
    }

    public void stepForward() {
        x += direction.dx();
        y += direction.dy();
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
}
