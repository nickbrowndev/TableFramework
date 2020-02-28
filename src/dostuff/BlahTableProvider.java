package dostuff;

import data.ColumnMap;
import data.ColumnMapDataMapper;
import data.HibernateQueryDataProvider;
import data.Query;
import table.TableDataProvider;
import table.TableRequest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class BlahTableProvider implements TableDataProvider<String[]> {

    String[] row = {"hello", "goodbye"};
    List<String[]> results = new ArrayList<>();


    private HibernateQueryDataProvider<String[]> queryProvider = new HibernateQueryDataProvider<String[]>(results);
    private ColumnMapDataMapper<Object> columnMapDataMapper = new ColumnMapDataMapper<>(new ColumnMap<>());

    @Override
    public Collection<String[]> apply(TableRequest tableRequest) {

        results.add(row);

        Map<String, Object> queryParameters = columnMapDataMapper.getForwardFunction().apply(tableRequest.getParameters());
        Query query = new Query("Get something from something", queryParameters);

        Collection<String[]> results = queryProvider.getResults(query, tableRequest);

        return results;
    }
}
