package data;

import java.util.Optional;

public class Filter {
    public enum Operator {EQ, NEQ, ISNULL, ISNOTNULL, LT, LTE, GT, GTE, STARTSWITH, ENDSWITH, CONTAINS, DOESNOTCONTAIN, ISEMPTY, ISNOTEMPTY};
    private String field;
    private Operator operator;
    private Boolean ignoreCase;
    private Object value;

    private Filter(final String field, final Operator operator, final Object value) {
        this.field = field;
        this.operator = operator;
        this.value = value;
    }

    private Filter(final String field, final Operator operator, final String value, final boolean ignoreCase) {
        this(field, operator, value);
        this.ignoreCase = ignoreCase;
    }

    public static Filter of(String field, final Operator operator, final Object value) {
        return new Filter(field, operator, value);
    }

    public static Filter of(String field, final Operator operator, final String value, final boolean ignoreCase) {
        return new Filter(field, operator, value, ignoreCase);
    }

    public String getField() {
        return this.field;
    }

    public Operator getOperator() {
        return this.operator;
    }

    public Object getValue() {
        return this.value;
    }

    public Optional<Boolean> getIgnoreCase() {
        return Optional.ofNullable(this.ignoreCase);
    }
}
