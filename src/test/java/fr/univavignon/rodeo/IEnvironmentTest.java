package fr.univavignon.rodeo;


import static org.mockito.Mockito.*;

import java.util.List;

import junit.framework.Assert;

import org.junit.Rule;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import fr.univavignon.rodeo.api.IEnvironment;
import fr.univavignon.rodeo.api.IEnvironmentProvider;
import fr.univavignon.rodeo.api.ISpecie;


public final class IEnvironmentTest {

	@Mock private static IEnvironment environnementMock;
	@Rule public static  MockitoRule mockitoRule = MockitoJUnit.rule();

	public static List<ISpecie>  liste ;

	public static void TestEnvironnement () {
		
		when(environnementMock.getSpecies()).thenReturn (liste);
		when(environnementMock.getAreas()).thenReturn (1);

	}

	
	

	public void getSpeciesTest (){
		Assert.assertEquals (liste , environnementMock.getSpecies());

	}
	
	public void getAreasTest (){
		Assert.assertEquals (1 , environnementMock.getAreas());
	}
	
}

