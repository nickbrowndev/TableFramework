package data;

import java.util.Map;

public class ColumnMap<T> {

    public Map<String, T> mapToLeft(Map<String, T> map) {
        System.out.println("mapping to left");
        return map;
    }

    public Map<String, T> mapToRight(Map<String, T> map) {
        System.out.println("mapping to right");
        return map;
    }
}
