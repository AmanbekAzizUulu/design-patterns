package creational_patterns.factory.abstract_entities;

import creational_patterns.factory.entities.enums.SwordType;

public abstract class Sword {
	protected final SwordType swordType;

	protected Sword() {
		this.swordType = initializeSwordType();
	}

	protected abstract SwordType initializeSwordType();
}
