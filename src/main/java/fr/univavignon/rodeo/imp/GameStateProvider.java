package fr.univavignon.rodeo.imp;


import java.util.ArrayList;

import fr.univavignon.rodeo.api.IGameState;
import fr.univavignon.rodeo.api.IGameStateProvider;

public class GameStateProvider implements IGameStateProvider {

	@SuppressWarnings("unused")
	private IGameState gameState;

	
	private ArrayList<IGameState> iGS;
	
	
	public void save(IGameState gameState) {
		
	}

	
	public IGameState get(String name) throws IllegalArgumentException {
		if (name == null) throw new IllegalArgumentException();

		for (IGameState iGss : iGS)
			if (iGss.getName().equals(name))
				return iGss;
		
		IGameState var = new GameState("var_name");
		iGS.add(var);
		return var;
		
	
	}

}
