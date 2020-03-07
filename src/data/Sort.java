package data;

public class Sort {
    public enum Direction {ASC, DESC};
    private String field;
    public Direction direction;

    private Sort(final String field, final Direction direction) {
        this.field = field;
        this.direction = direction;
    }

    public static Sort ofAsc(String field) {
        return new Sort(field, Direction.ASC);
    }

    public static Sort ofDesc(String field) {
        return new Sort(field, Direction.DESC);
    }

    public String getField() {
        return this.field;
    }

    public Direction getDirection() {
        return this.direction;
    }
}
