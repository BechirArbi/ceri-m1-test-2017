package fr.univavignon.rodeo;


import static org.mockito.Mockito.*;
import junit.framework.Assert;

import org.junit.Rule;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import fr.univavignon.rodeo.api.IGameState;
import fr.univavignon.rodeo.api.IGameStateProvider;
import fr.univavignon.rodeo.api.SpecieLevel;



public class IGameStateTest {
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


	
	
	
	
}
