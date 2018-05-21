package fr.univavignon.rodeo.imp;


import java.util.List;

import fr.univavignon.rodeo.api.IEnvironment;
import fr.univavignon.rodeo.api.ISpecie;

	public class Environment implements IEnvironment {

		private String name;
		private int areas;
		private List<ISpecie> species;

		public Environment(String name, int areas, List<ISpecie> species) {
			this.name = name;
			this.areas = areas;
			this.species = species;
		}

		@Override
		public String getName() {
			return name;
		}

		@Override
		public int getAreas() {
			return areas;
		}

		@Override
		public List<ISpecie> getSpecies() {
			return species;
		}

	}
	
	

