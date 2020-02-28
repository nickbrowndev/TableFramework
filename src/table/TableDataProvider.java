package table;

import java.util.Collection;
import java.util.function.Function;

public interface TableDataProvider<T> extends Function<TableRequest, Collection<T>> {

}
