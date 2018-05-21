package fr.univavignon.rodeo;

import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Rule;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import fr.univavignon.rodeo.api.IEnvironment;
import fr.univavignon.rodeo.api.IEnvironmentProvider;


public class IEnvironmentProviderTest {
	
	@Mock private static IEnvironmentProvider environnementproviderMock;
	@Rule public static MockitoRule mockitoRule = MockitoJUnit.rule();
	
	public static IEnvironment environnement;
	public static List<String>  liste ;
	

	
	public static void TestEnvironnementProvider () {
	
	
		liste = new ArrayList<String>();

		liste.add("a");

		liste.add("b");

		liste.add("c");

	when(environnementproviderMock.getEnvironment("testEnivronment")).thenReturn (environnement);
	when(environnementproviderMock.getAvailableEnvironments()).thenReturn(liste);

	}
	
	public void getEnvironmentTest (){
		Assert.assertEquals (environnement , environnementproviderMock.getEnvironment("testEnivronment"));

	}
	
	public void getAvailableEnvironmentsTest (){
		Assert.assertEquals (liste , environnementproviderMock.getAvailableEnvironments());
	}
	
}
