package data;

import data.PagedDataProvider;
import data.Query;
import table.DataProvider;

import java.util.Collection;
import java.util.List;

public class HibernateQueryDataProvider<T> implements DataProvider<Collection<T>, Query>,  PagedDataProvider<Collection<T>, Query> {

    private Collection<T> results;

    public HibernateQueryDataProvider(Collection<T> results) {
        this.results = results;
    }

    @Override
    public Collection<T> getResults(Query query, PaginationConfig config) {
        System.out.println("Getting results for query: '" + query.getQuery() + "' using '" + (query.getParameters().isPresent() ? query.getParameters().get() : " no params"));
        return this.results;
    }

    @Override
    public Collection<T> getResults(Query query) {
        System.out.println("Getting results for query: '" + query.getQuery() + "");
        return this.results;
    }
}
