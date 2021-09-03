package com.interview.test.drivers;

import java.util.HashMap;
import java.util.Map;

public class Params {
    private final Map<String, Object> params = new HashMap<>();
    public void addParam(String key, Object value){
        params.put(key, value);
    }
    public Object getParam(String key) {
        return params.get(key);
    }
}
