package fr.univavignon.rodeo;


import static org.mockito.Mockito.*;

import java.util.List;

import org.junit.Assert;
import org.junit.Rule;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import fr.univavignon.rodeo.api.IAnimal;
import fr.univavignon.rodeo.api.ISpecie;


public class ISpecieTest {

	@Mock private static ISpecie SpecieMock;
	@Rule public static MockitoRule mockitoRule = MockitoJUnit.rule();
	
	public static List<IAnimal>  liste ;

	public static void TestSpecie () {

		when(SpecieMock.getArea()).thenReturn (1);
		when(SpecieMock.getAnimals()).thenReturn (liste);

	}
		
  public void getAnimalsTest() {
		Assert.assertEquals (liste , SpecieMock.getAnimals());
		}
	
	public void getAreaTest (){
		Assert.assertEquals (1 , SpecieMock.getArea());

	}
}

