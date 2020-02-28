package dostuff;

import cdf.FlowSessionFacade;
import table.TableDataProvider;
import table.TableRequest;

import java.util.Map;
import java.util.function.Supplier;

public class BlahMediatorView {

    public void getDataForStuff(Map<String, Object> jamesContext, TableRequest request) {

        // TODO export
        // TODO json
        // TODO parameter conversion

        TableDataProvider<String[]> tableDataProvider = new FlowSessionFacade(jamesContext).get("blahTable", BlahTableProvider::new);
        System.out.println(tableDataProvider.apply(request));

    }
}
