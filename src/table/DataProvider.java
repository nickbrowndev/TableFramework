package table;

public interface DataProvider<T, F> {

    public T getResults(F f);
}
