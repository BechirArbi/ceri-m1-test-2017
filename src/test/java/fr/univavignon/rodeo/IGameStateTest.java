package fr.univavignon.rodeo;


import static org.mockito.Mockito.*;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import fr.univavignon.rodeo.api.IGameState;
import fr.univavignon.rodeo.api.SpecieLevel;
import fr.univavignon.rodeo.api.IAnimal;



public class IGameStateTest {
	
	private IGameState gameState;
	
	private IAnimal animal;


	@Mock private static IGameState GameStateMock;
	@Rule public static  MockitoRule mockitoRule = MockitoJUnit.rule();
	
	public static   SpecieLevel SP ;


	public static void testGameState() { 
	
		when(GameStateMock.getSpecieLevel(null)).thenReturn(SP);
		when(GameStateMock.getProgression()).thenReturn(5);
	
}
	
	public void getSpecieLevelTest (){
		Assert.assertEquals (SP , GameStateMock.getSpecieLevel(null));
	
	}

	public void getProgressionTest (){
		Assert.assertEquals (5 , GameStateMock.getProgression());
	
	}

	
	// Tester les exeception de l'interface IGameState 
	
	@Test(expected = IllegalStateException.class)
	public void testExploreArea() {
		gameState.exploreArea();
	}

	@Test(expected = IllegalArgumentException.class)
	public void testCatchAnimalNull() {
		gameState.catchAnimal(null);
	}

	@Test(expected = IllegalStateException.class)
	public void testCatchAnimal() {
		gameState.catchAnimal(animal);
	}
	
}
