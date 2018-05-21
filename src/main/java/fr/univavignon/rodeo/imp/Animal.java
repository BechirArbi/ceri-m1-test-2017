package fr.univavignon.rodeo.imp;

import fr.univavignon.rodeo.api.IAnimal;


public class Animal implements IAnimal {

	private String name;
	private int XP;
	private boolean Secret;
	private boolean Endangered;
	private boolean Boss;

	public Animal(final String name, final int XP, final boolean Secret,
	              final boolean Endangered, final boolean Boss) {
		this.name = name;
		this.XP = XP;
		this.Secret = Secret;
		this.Endangered = Endangered;
		this.Boss = Boss;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getXP() {
		return XP;
	}

	@Override
	public boolean isSecret() {
		return Secret;
	}

	@Override
	public boolean isEndangered() {
		return Endangered;
	}

	@Override
	public boolean isBoss() {
		return Boss;
	}


}


