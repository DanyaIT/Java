import java.util.Optional;

public enum Direction {

    TOP, RIGHT, BOTTOM, LEFT;

    public static Optional<Direction> ofString(String str) {
        Direction[] values = values();
        for (Direction value : values) {
            if (str.equals(value.name())) {
                return Optional.of(value);
            }
        }
        return Optional.empty();
    }
}
