package cucumber;

import java.util.HashMap;
import java.util.Map;

import enums.Context;

public class ScenarioContext {

	private Map<String, Object> scenariocontext;

	public ScenarioContext() {

		scenariocontext = new HashMap<>();
	}

	public void setContext(Context key, Object value) {
		scenariocontext.put(key.toString(), value);

	}
	
	
	public Object getContext(Context key)
	{
		return scenariocontext.get(key.toString());
		
		
	}
	
	public Boolean isContains(Context key)
	{
		
		
		return scenariocontext.containsKey(key.toString());
	}

}
