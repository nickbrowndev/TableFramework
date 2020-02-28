package data;

import java.util.Optional;

public interface PaginationConfig {

    public Optional<Integer> getPageSize();

    public Optional<Integer> getPage();

    public Optional<Integer> getTake();

    public Optional<Integer> getSkip();

}
