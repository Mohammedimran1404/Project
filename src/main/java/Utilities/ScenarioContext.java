package Utilities;

import Enums.Context;

import java.util.Map;
import java.util.HashMap;

public class ScenarioContext {

    private final Map<String, Object> scenarioContext;

    public ScenarioContext(){
        scenarioContext=new HashMap<>();
    }
    public void setContext(Context key,Object value){
        scenarioContext.put(key.toString(),value);
    }
    public Object getContext(Context key){
        return scenarioContext.get(key.toString());
    }

    public Boolean isContains(Context key){
        return scenarioContext.containsKey(key.toString());
    }
}
