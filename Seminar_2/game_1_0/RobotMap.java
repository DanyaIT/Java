package Seminar_2.game_1_0;

import java.util.ArrayList;
import java.util.List;

public class RobotMap {
    private final int n;
    private final int m;
    private int size;
    private final List<Robot> robots;

    public RobotMap(int n, int m, int size) {
        this.n = n;
        this.m = m;
        this.size = size;
        this.robots = new ArrayList<>();

        if (n < 0 || m < 0) {
            throw new IllegalStateException("Точка" + " (" + n + ";" + m + ") недопустима");
        }
    }

    public RobotMap(int n, int m) {
        this.n = n;
        this.m = m;
        this.robots = new ArrayList<>();
        size = 5;
        if (n < 0 || m < 0) {
            throw new IllegalStateException("Точка" + " (" + n + ";" + m + ") недопустима");
        }
    }

    public Robot createRobot(Point point) {
        validatePoint(point);
        Robot robot = new Robot(point);
        robots.add(robot);
        if (robots.size() > size) {
            throw new IllegalStateException("Превышен лимит роботов на карте!");
        }
        return robot;
    }

    private void validatePoint(Point point) {
        validatePointIsCorrect(point);
        validatePointIsFree(point);
    }

    public void validatePointIsCorrect(Point point) {
        if (point.x() < 0 || point.x() > n || point.y() < 0 || point.y() > m) {
            throw new IllegalStateException("Некоректное значение точки");
        }
    }

    private void validatePointIsFree(Point point) {
        for (Robot robot : robots) {
            if (robot.point.equals(point)) {
                throw new IllegalStateException("Точка " + point + " занята");
            }
        }
    }

    public class Robot {
        private Direction direction;
        private Point point;

        public Robot(Point point) {
            this.direction = direction.TOP;
            this.point = point;
        }

        public void changeDirection(Direction direction) {
            this.direction = direction;
        }

        public void move(int count) {
            Point newPoint = switch (direction) {
                case TOP -> new Point(point.x() - count, point.y());
                case BOTTOM -> new Point(point.x() + count, point.y());
                case LEFT -> new Point(point.x(), point.y() - count);
                case RIGHT -> new Point(point.x(), point.y() + count);
            };
            validatePoint(newPoint);
            System.out.println("Робот переместился с " + point + " на " + newPoint);
            this.point = newPoint;
        }

        @Override
        public String toString() {
            return point.toString() + "[" + direction.name() + "]";
        }

    }
}
