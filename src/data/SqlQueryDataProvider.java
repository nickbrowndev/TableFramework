package data;

import data.PagedDataProvider;
import data.Query;

import java.util.List;

public class SqlQueryDataProvider<T> implements PagedDataProvider<List<T>, Query> {

    public List<T> getResults(Query query, PaginationConfig config) {
        return null;
    }
}
