package fr.univavignon.rodeo.imp;


import java.util.ArrayList;
import java.util.List;

import fr.univavignon.rodeo.api.IAnimal;
import fr.univavignon.rodeo.api.ISpecie;

public class Specie implements ISpecie {

	private List<IAnimal> animals;
	private int area;

	public Specie(int var_area,List<IAnimal> animals) {
		super();
		area = var_area;
		animals =new ArrayList<IAnimal>();
		animals.addAll(animals);
	}

	public int getArea() {
		return area;
	}

	public List<IAnimal> getAnimals() {
		return animals;
	}

	@Override
	public String getName() {
		return null;
	}

}
