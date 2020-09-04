package no.kristiania.httpclient;

import java.util.HashMap;
import java.util.Map;

public class QueryString {
    private final String value;
    private final String parameterName;
    private Map<String,String> parameters = new HashMap<>();

    public QueryString(String queryString) {
        for (String parameter : queryString.split("&")) {
            
        }

        String parameter = queryString;
        int equalPos = queryString.indexOf('=');
        value = queryString.substring(equalPos+1);
        parameterName = queryString.substring(0, equalPos);
        parameters.put(parameterName, value);
    }

    public String getParameter(String name) {
       return parameters.get(name);
    }
}

