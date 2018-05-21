package fr.univavignon.rodeo.imp;


import java.util.List;
import java.util.Map;

import fr.univavignon.rodeo.api.IEnvironment;
import fr.univavignon.rodeo.api.IEnvironmentProvider;

public class EnvironmentProvider implements IEnvironmentProvider {

	private Map<String, Environment> environments;

	public EnvironmentProvider() {
			}


	@SuppressWarnings("unchecked")
	public List<String> getAvailableEnvironments() {
		return (List<String>) environments.keySet();
	}

	public IEnvironment getEnvironment(String name)
	throws IllegalArgumentException {
		if (!environments.containsKey(name))
			throw new IllegalArgumentException("AAA");
		return environments.get(name);
	}

}
