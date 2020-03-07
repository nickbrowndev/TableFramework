package data;

public interface PagedSortedDataProvider<T, F> {

    public <C extends PaginationConfig & SortableConfig> T getResults(F f, C paginationConfig);
}
