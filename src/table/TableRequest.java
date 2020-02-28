package table;

import data.PaginationConfig;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class TableRequest<T> implements PaginationConfig {

    public Map<String, Object> parameters;
    public Integer pageSize;
    public Integer page;
    public Integer skip;
    public Integer take;
    public List<Sort> sort;

    public TableRequest(Map<String, Object> parameters) {
        this.parameters = parameters;
    }

    public Map<String, Object> getParameters() {
        return Collections.unmodifiableMap(parameters);
    }

    @Override
    public Optional<Integer> getPageSize() {
        return Optional.ofNullable(pageSize);
    }

    @Override
    public Optional<Integer> getPage() {
        return Optional.ofNullable(page);
    }

    @Override
    public Optional<Integer> getTake() {
        return Optional.ofNullable(take);
    }

    @Override
    public Optional<Integer> getSkip() {
        return Optional.ofNullable(skip);
    }

    public static class Sort {
        public enum Direction {ASC, DESC};
        private String field;
        public Direction direction;
    }
}
