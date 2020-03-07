package data;

public interface PagedDataProvider<T, F> {

    public T getResults(F f, PaginationConfig config);
}
