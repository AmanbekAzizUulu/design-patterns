package creational_patterns.factory_example_2.abstract_entities;

import creational_patterns.factory_example_2.entities.enums.SwordType;

public abstract class Sword {
	protected final SwordType swordType;

	protected Sword() {
		this.swordType = initializeSwordType();
	}

	protected abstract SwordType initializeSwordType();
}
