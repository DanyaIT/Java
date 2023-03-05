public class C3PO implements Robot {

    RobotMap map;

    public static final Direction DEFAULT_DIRECTION = Direction.TOP;

    private final Long id;
    private Direction direction;
    private Point point;

    public C3PO(RobotMap map, Point point, long id) {
        this.map = map;
        this.id = id;
        this.direction = DEFAULT_DIRECTION;
        this.point = point;
    }

    public void changeDirection(Direction direction) {
        this.direction = direction;
    }

    public void move() {
        Point newPoint = switch (direction) {
            case TOP -> new Point(point.x() - 1, point.y());
            case RIGHT -> new Point(point.x(), point.y() + 1);
            case BOTTOM -> new Point(point.x() + 1, point.y());
            case LEFT -> new Point(point.x(), point.y() - 1);
            default -> throw new IllegalArgumentException("Unexpected value: " + direction);
        };
        map.validatePoint(newPoint);

        System.out.println("Робот переместился с " + point + " на " + newPoint);
        this.point = newPoint;
    }

    @Override
    public String toString() {
        return "C3PO [" + id + "] " + point.toString() + " [" + direction.name() + "]";
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public Point getPoint() {
        return point;
    }

}
