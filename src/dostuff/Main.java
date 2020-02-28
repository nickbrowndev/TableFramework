package dostuff;

import table.TableRequest;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, Object> flowSessionData = new HashMap<>();

        Map<String, Object> parameters = new HashMap<>();
        parameters.put("id", "123abc");
        parameters.put("isLTR", true);

        TableRequest<Object> tableRequest = new TableRequest<>(parameters);


        new BlahMediatorView().getDataForStuff(flowSessionData, tableRequest);

        new BlahMediatorView().getDataForStuff(flowSessionData, tableRequest);
        new BlahMediatorView().getDataForStuff(flowSessionData, tableRequest);


    }


}
