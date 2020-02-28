package data;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Query {
    private String query;
    private Map<String, Object> parameters;

    public Query(String query) {
        this.query = query;
    }

    public Query(String query, Map<String, Object> parameters) {
        this(query);
        this.parameters = new HashMap<>(parameters);
    }

    public String getQuery() {
        return this.query;
    }

    public Optional<Map<String, Object>> getParameters() {
        return Optional.ofNullable(parameters);
    }
}
