package data;

import java.util.function.Function;

public interface BiDataMapper<T, F> {


    public Function<T, F> getForwardFunction();

    public Function<F, T> getReverseFunction();


}
