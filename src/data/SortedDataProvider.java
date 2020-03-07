package data;

public interface SortedDataProvider<T, F> {

    public T getResults(F f, SortableConfig config);
}
