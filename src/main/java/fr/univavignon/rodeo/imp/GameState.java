package fr.univavignon.rodeo.imp;


import fr.univavignon.rodeo.api.IAnimal;
import fr.univavignon.rodeo.api.IEnvironmentProvider;
import fr.univavignon.rodeo.api.IGameState;
import fr.univavignon.rodeo.api.ISpecie;
import fr.univavignon.rodeo.api.SpecieLevel;

import fr.univavignon.rodeo.imp.EnvironmentProvider;



public class GameState implements IGameState {

	private String name;


	private int currentArea;
    private String currentEnvironment = null;
	private IEnvironmentProvider environmentProvider;

	public GameState(final String name) {
		this.name = name;
		environmentProvider = new EnvironmentProvider();
	}

	@Override
	public String getName() {
		return name;
	}
	

	@Override
	public void exploreArea() throws IllegalStateException {
		currentArea++;
		
		if (currentArea > environmentProvider.getEnvironment(currentEnvironment).getAreas()) {
			
			currentArea = 0;
		}
	}


	@Override
	public void catchAnimal(IAnimal animal) throws IllegalArgumentException,
		IllegalStateException {

	}
	@Override
	public SpecieLevel getSpecieLevel(ISpecie specie) throws IllegalArgumentException {
		return null;
	}

	@Override
	public int getProgression() {

		return 100;
	}



}
