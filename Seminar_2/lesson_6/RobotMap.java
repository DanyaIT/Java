import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class RobotMap {

    private final int n;
    private final int m;
    private final List<Robot> robots;
    private static Long idCounter = 1L;

    public RobotMap(int n, int m) {
        this.n = n;
        this.m = m;
        this.robots = new ArrayList<>();
    }

    public Robot createRobot(String robotName, Point point) {
        validatePoint(point);
        if (robotName.equals("R2D2")) {
            Robot robot = new R2D2(this, point, idCounter++);
            robots.add(robot);
            return robot;
        } else if (robotName.equals("C3PO")) {
            Robot robot = new C3PO(this, point, idCounter++);
            robots.add(robot);
            return robot;
        }
        return null;
    }

    public void acceptRobots(Consumer<Robot> consumer) {
        for (Robot robot : robots) {
            consumer.accept(robot);
        }
    }

    public Optional<Robot> getById(Long id) {
        for (Robot robot : robots) {
            if (id.equals(robot.getId())) {
                return Optional.of(robot);
            }
        }

        return Optional.empty();
    }

    public void validatePoint(Point point) {
        validatePointIsCorrect(point);
        validatePointIsFree(point);
    }

    private void validatePointIsCorrect(Point point) {
        if (point.x() < 0 || point.x() > n || point.y() < 0 || point.y() > m) {
            throw new IllegalStateException("Некоректное значение точки!");
        }
    }

    private void validatePointIsFree(Point point) {
        for (Robot robot : robots) {
            Point robotPoint = robot.getPoint();
            if (robotPoint.equals(point)) {
                throw new IllegalStateException("Точка " + point + " занята!");
            }
        }
    }

    public boolean delete(Long id) {
        Optional<Robot> robot = this.getById(id);
        if (robot.isPresent()) {
            Robot value = robot.get();
            robots.remove(value);
            return true;
        }
        return false;
    }

}
