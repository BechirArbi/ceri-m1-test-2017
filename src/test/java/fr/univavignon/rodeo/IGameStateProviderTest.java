package fr.univavignon.rodeo;


import static org.mockito.Mockito.*;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import fr.univavignon.rodeo.api.IGameState;
import fr.univavignon.rodeo.api.IGameStateProvider;


public class IGameStateProviderTest {  
	
	
	private IGameStateProvider gameStateProvider;
	
	
	@Mock private static IGameStateProvider GameStateProviderMock;
	@Rule public static  MockitoRule mockitoRule = MockitoJUnit.rule();
	
	public static IGameState  GSP ;
	
public static void testGameStateProvider() { 
	
	when(GameStateProviderMock.get("AAA")).thenReturn(GSP);
	
	
}

public void getTest (){
	Assert.assertEquals (GSP , GameStateProviderMock.get("AAA"));

}


public void saveTest(){
	// pas de test
}


@Test(expected = IllegalArgumentException.class)
public void testGetNull() {
	gameStateProvider.get(null);
}

}
