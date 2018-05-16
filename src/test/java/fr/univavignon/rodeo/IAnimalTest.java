package fr.univavignon.rodeo;

import static org.mockito.Mockito.*;
import junit.framework.Assert;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import fr.univavignon.rodeo.api.IAnimal;



public class IAnimalTest {

	@Mock private static IAnimal animalMock;
	@Rule public static MockitoRule mockitoRule = MockitoJUnit.rule();
	
	public static void TestANIMAL () {
	// private static IAnimalTest Animal ;
	
	when(animalMock.getXP()).thenReturn (1);
	when (animalMock.getXP()).thenThrow(new Exception());
	when (animalMock.isSecret()).thenReturn (true);
	when (animalMock.isEndangered()).thenReturn(false);
	when (animalMock.isBoss()).thenReturn(false);
	}

	
	
	public void getXPTest() {
		
		Assert.assertEquals (1 , animalMock.getXP());
	}

	@Test
	public void isSecretTest() {
		Assert.assertEquals (true , animalMock.isSecret());
		}
	
	@Test
	public void isEndangeredTest() {
		Assert.assertEquals (false , animalMock.isEndangered());
		}
	@Test
	public void isBossTest() {
		Assert.assertEquals (false , animalMock.isBoss());
	}
	

	
	
}
