package cdf;

import javax.swing.text.html.Option;
import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;

public class FlowSessionFacade {

    private String identifier;
    private Map<String, Object> sessionData;

    public FlowSessionFacade(Map<String, Object> session) {
        this.sessionData = session;
    }

    public <T> T get(String identifier, Supplier<T> constructor)
    {
        T result;
        Optional<T> existingFlowSessionObject = get(identifier);
        if (existingFlowSessionObject.isPresent()) {
            result = existingFlowSessionObject.get();
        } else {
            T object = constructor.get();
            set(identifier, object);
            result = object;
            System.out.println("Returning new object");
        }
        return result;
    }

    public <T> Optional<T> get(String identifier)
    {
        System.out.println("Getting object '" + identifier + "'from flowSession");
        return Optional.ofNullable((T) sessionData.get(identifier));
    }

    public <T> void set(String identifier, T object) {
        this.sessionData.put(identifier, object);
        System.out.println("setting object '" + identifier + "' in flowsession");
    }

}
