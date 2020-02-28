package data;

import java.util.Map;
import java.util.function.Function;

public class ColumnMapDataMapper<T> implements BiDataMapper<Map<String, T>, Map<String, T>> {

    private ColumnMap<T> columnMap;

    public ColumnMapDataMapper(ColumnMap<T> map) {
        this.columnMap = map;
    }
    @Override
    public Function<Map<String, T>, Map<String, T>> getForwardFunction() {
        System.out.println("Mapping data forward");
        return columnMap::mapToRight;
    }

    @Override
    public Function<Map<String, T>, Map<String, T>> getReverseFunction() {
        System.out.println("Mapping data reverse");
        return columnMap::mapToLeft;
    }
}
